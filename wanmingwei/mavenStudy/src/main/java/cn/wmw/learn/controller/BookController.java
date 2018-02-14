package cn.wmw.learn.controller;

import cn.wmw.learn.domain.BookDO;
import cn.wmw.learn.service.BookService;
import cn.wmw.learn.vo.GetAllBookReq;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mingwei on 18-1-26
 */
@RestController
@Slf4j
public class BookController {
    @Resource
    private BookService bookService;

    @RequestMapping(value = "/book/get/all",method = RequestMethod.POST)
    public List<BookDO> getAllBooks(GetAllBookReq req) {
        log.info(req.toString());
        //此return即返回给前端，即把这个List<BookDO>交给前端
        return bookService.getAllBooks(req.getPageSize(),req.getMaxPageCount());
    }
}
