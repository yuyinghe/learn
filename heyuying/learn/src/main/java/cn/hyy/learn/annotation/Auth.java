package cn.hyy.learn.annotation;

import cn.hyy.learn.enums.RoleEnum;

import javax.xml.bind.Element;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by heyuying on 18-3-25
 */


@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Auth {
    /**
     * 哪些角色CODE可以访问
     */

    RoleEnum[] roles();

}
