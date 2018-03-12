package cn.lgw.learn.controller;

import cn.lgw.learn.domain.BookDO;
import cn.lgw.learn.service.BookService;
import cn.lgw.learn.vo.GetAllBookReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * Created by leiguowei on 2018/1/26
 */
@RestController
@Slf4j
public class BookController {
    @Resource
    private BookService bookService;

    @RequestMapping(value = "/book/get/all", method = RequestMethod.POST)
    public List<BookDO> getAllBooks(GetAllBookReq req) {
        log.info("req size={} pageCount={}", req.getPageSize(), req.getMaxPageCount());
        return bookService.getAllBooks(req.getPageSize(), req.getMaxPageCount());
    }
}