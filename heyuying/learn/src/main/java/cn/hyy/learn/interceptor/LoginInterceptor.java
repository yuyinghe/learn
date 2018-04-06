package cn.hyy.learn.interceptor;

import cn.hyy.learn.service.impl.LoginServiceImpl;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by heyuying on 18-3-25
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Resource
    LoginServiceImpl loginServiceImpl;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {

        return true;
    }

}
