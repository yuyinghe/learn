package cn.hyy.learn.controller;

import cn.hyy.learn.domain.BookDO;
import cn.hyy.learn.to.resp.RestResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.print.Book;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by heyuying on 18-1-26
 */

//网页请求相关的注解 说明是处理用户请求的类
//说明这个类是用来处理HTTP的  Rest相当于HTTP
@RestController
public class IndexController {
//    请求映射 网址到达服务器网址会去掉，只会留下 / 及后面的东西 , 其组成请求参数
//    请求参数为“/”的会执行 showIndex方法
//    例如访问www.baidu.com                     其请求参数是 /
//    例如访问www.baidu.com/s?ie=UTF-8&wd=post  其请求是 /s?ie=UTF-8&wd=post
//    method 指明请求方式（请求方式一般有get post（新增）put（跟新）delete）


    public static ThreadLocal<StringBuilder> str = new ThreadLocal<>();

    public static int count = 0;
    public static StringBuilder sb = new StringBuilder();

    @RequestMapping(value = "/")
    public String showIndex(HttpSession session, HttpServletRequest request) {
        count++;
        if (session.getAttribute("name") == null) {
            session.setAttribute("name", "用户名字"+count);
        }

        return session.getAttribute("name")
                + "</br> 当前线程: "+ Thread.currentThread().getName()
                + "</br> count" + count;
    }

  /*  public String showIndex() {
        str.set(new StringBuilder());
        count++;
        str.get().append(count).append(" ");
        sb.append(count).append(" ");
        return "threadLocal: " + str.get().toString() +
                "</br>Common: " + sb.toString() +
                "</br>当前线程: " + Thread.currentThread().getName();
    }*/

}

  /*  @RequestMapping(value = "/",method = RequestMethod.GET)    //默认GET查找 POST新增 PUT更新 DELETE 删除
    public BookDO showIndex() {
        BookDO book = new BookDO();
        book.setBrief("name");
        book.setAuthor("author");
        book.setCatalogue("catalogue");
        book.setBrief("简介");
        return book;
    }*/



   /* static int i;
    @RequestMapping(value = "/get/api", method = RequestMethod.GET)
    public static int main(String[] args) {
        return i++;
    }*/

   /* public Map<String, String> showIndex() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("name", "name");
        return map;
    }
*/

     /* public String showIndex() {

        return "Hello World1111111111111";
    }*/
//}
