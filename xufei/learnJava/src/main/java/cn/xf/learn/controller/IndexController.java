package cn.xf.learn.controller;

import cn.xf.learn.domin.BookDO;
import cn.xf.learn.mapper.BookMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by xufei on 18-1-26
 */

@RestController
public class IndexController {

    @Resource
    BookMapper bookMapper;

    @RequestMapping(value = "/")   //Rest = http
    public BookDO showIndex() {
        BookDO bookDO = bookMapper.selectByPrimaryKey(10001);
        return bookDO;

    }


}
