package cn.hyy.learn.aspect;

/**
 * Created by heyuying on 18-3-25*/



import cn.hyy.learn.enums.ExceptionEnum;
import cn.hyy.learn.exception.CommonException;
import cn.hyy.learn.to.resp.RestResponse;
import cn.hyy.learn.util.LogUtil;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Controller切面逻辑
 * <p>
 * 1. 请求参数统一校验(待定）；<br>
 * 2. 输入出参数日志打印；<br>
 * 3. 异常响应结果格式化。
 * </p>*/



@Slf4j
@Aspect
@Component
public class ControllerAspect {

    //＠Pointcut注释一个切入点，定义一个切入点，
    // public *(通配符，返回任意值) cn.lgw.learn.controller（这个包下）..(两个点可以表示包下可以继续搜索)*[的任意类].*[任意方法](..)[的任意参数])
    //@Pointcut注释一个切入点，定义一个切入点，public 返回任意值，这个包下的任意类的任意方法（任意参数）
    @Pointcut(value = "execution(public * cn.hyy.learn.controller..*.*(..))")
    public void doSomething() {

    }

    //通知,对方法doSomething()进行加强，还有@After()，@Before()
    @Around("doSomething()")
    public Object handle(ProceedingJoinPoint joinPoint) throws Throwable {
        String controllerName = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = ((MethodSignature)joinPoint.getSignature()).getMethod().getName();

        //输入日志
        log.info("[Controller]({})] {},input=[{}]",
                controllerName,methodName, LogUtil.buildLogFromArgs(joinPoint.getArgs()));

        Object result;
        try {
            result = joinPoint.proceed();
            log.info("[Controller({})] {}, output=[{}]",
                    controllerName, methodName, JSON.toJSONString(result));

        } catch (CommonException e) {
            log.info("[Controller({})] {}, throw exception code={} message={}",
                    controllerName, methodName, e.getCode(), e.getMessage());
            return RestResponse.error(e.getCode(), e.getMessage());

        } catch (Exception e) {
            log.info("[Controller({})] {}, throw unmatchable exception message={}",
                    controllerName, methodName, e.getMessage());
            return RestResponse.serverError(ExceptionEnum.SERVER_ERROR.getMessage());

        }
        return  result;
    }


}
