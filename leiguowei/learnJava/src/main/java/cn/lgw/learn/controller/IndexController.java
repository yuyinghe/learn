package cn.lgw.learn.controller;

import cn.lgw.learn.domain.BookDO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Created by leiguowei on 2018/1/26
 */
@RestController
public class IndexController {
    @RequestMapping(value = "/")
    public BookDO showIndex() {
        BookDO book = new BookDO();
        book.setName("name");
        book.setIntro("intro");
        book.setCatalogue("catalogue");
        book.setAuthor("作者");
        return book;
    }
}