package cn.hyy.learn.util;

/**
 * Created by heyuying on 18-3-25
 */
public class LoginContext {

    public static ThreadLocal<String> username = new ThreadLocal<>();

    public static ThreadLocal<Long> userId = new ThreadLocal<>();

    public static ThreadLocal<String> name = new ThreadLocal<>();

}
