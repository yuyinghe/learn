package cn.hyy.learn.interceptor;

import cn.hyy.learn.annotation.Auth;
import cn.hyy.learn.util.LoginContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by heyuying on 18-3-25
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {

        HandlerMethod method = (HandlerMethod) handler;
        Auth role = method.getMethod().getAnnotation(Auth.class);
        return role == null || isPermitted();
    }

    private boolean isPermitted() {
        if (LoginContext.userId.get() == null) {
            return false;
        }
        return true;
    }
}
