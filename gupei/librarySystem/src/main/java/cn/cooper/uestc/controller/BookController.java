package cn.cooper.uestc.controller;


import cn.cooper.uestc.domain.BookDo;
import cn.cooper.uestc.service.BookService;
import cn.cooper.uestc.vo.GetAllBookReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * By GuPei 18-1-26
 */
@RestController
@Slf4j
public class BookController {
    @Resource
    private BookService bookService;

    @RequestMapping(value = "/book/get/all", method = RequestMethod.GET)
    public List<BookDo> getAllbooks(GetAllBookReq req) {
        log.info("req size={} pageCount={} ", req.getPageSize(), req.getMaxPageCount());
        return bookService.getAllBooks(req.getPageSize(), req.getMaxPageCount());
    }

}
