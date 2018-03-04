package cn.xzt.learn.controller;

import cn.xzt.learn.domain.BookDO;
import cn.xzt.learn.service.BookService;
import cn.xzt.learn.vo.GetAllBookReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.log.LogInputStream;

import javax.annotation.Resource;
import java.util.List;

/**
 * --Create by xzt-- on 18-1-26
 */
@Slf4j
@RestController
public class BookController {
    @Resource
    private BookService bookService;
    @RequestMapping(value = "/book/get/all",method = RequestMethod.POST)
    public List<BookDO> getAllBooks(GetAllBookReq req) {
        log.info("req pageSize={},maxPageCount={}",req.getPageSize(),req.getMaxPageCount());
    return bookService.getAllBooks(req.getPageSize(),req.getMaxPageCount());
    }
}
