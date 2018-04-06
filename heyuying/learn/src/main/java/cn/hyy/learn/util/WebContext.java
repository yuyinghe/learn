package cn.hyy.learn.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by heyuying on 18-3-25
 */
public class WebContext {

    public static ThreadLocal<HttpServletResponse> response = new ThreadLocal<>();

    public static ThreadLocal<HttpServletRequest> request = new ThreadLocal<>();
}
