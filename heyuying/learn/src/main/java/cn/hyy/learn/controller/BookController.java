package cn.hyy.learn.controller;
import cn.hyy.learn.domain.BookDO;
import cn.hyy.learn.service.impl.BookServiceImpl;
import cn.hyy.learn.vo.BookReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by heyuying on 18-1-26
 */

@RestController
@Slf4j
public class BookController {
    @Resource
    private BookServiceImpl bookServiceImpl;




    //查询所有书籍
    @RequestMapping(value = "/book/get/all", method = RequestMethod.POST)
    public List<BookDO> getAllBooks(@RequestBody BookReq req) {
        log.info(req.toString());
        //return到书的列表，传给spring,经过json处理交给tomcat，tomcat再交给前端
        return bookServiceImpl.getAllBooks(req.getPageSize(), req.getMaxPageCount());

    }
    //按书名查询
    @RequestMapping(value = "/book/get/selectWantedByName", method = RequestMethod.POST)
    public List<BookDO> getSelectBooks(@RequestBody BookReq req) {
        log.info("查找成功");
        return bookServiceImpl.getSelectBooks(req.getBookName());

    }
    //根据ID查询
    @RequestMapping(value = "/book/get/selectByPrimaryKey", method = RequestMethod.POST)
    public BookDO getSelectByPrimaryKey(@RequestBody BookReq req) {
        log.info("查找成功");
        return bookServiceImpl.selectByPrimaryKey(req.getId());
    }

    //根据书籍编号查询
    @RequestMapping(value = "/book/get/selectWantedByBookId", method = RequestMethod.POST)
    public List<BookDO> getSelectBooksByBookId(@RequestBody BookReq req) {
        log.info("查找成功");
        return bookServiceImpl.getSelectBooksByBookId(req.getBookId());
    }

    //插入一本书
    @RequestMapping(value = "/book/insert", method = RequestMethod.POST)
    public BookDO insert(@RequestBody BookReq req) {
        log.info("插入成功");
        return bookServiceImpl.selectByPrimaryKey(bookServiceImpl.insert(req));

    }

    //更新
    @RequestMapping(value = "/book/update",method = RequestMethod.POST)
    public BookDO update(@RequestBody BookReq req) {
        log.info("更新成功");
        return bookServiceImpl.selectByPrimaryKey(bookServiceImpl.update(req));
    }

    //根据id删除整本书籍
    @RequestMapping(value = "/book/deleteById",method = RequestMethod.POST)
    public int deleteByPrimaryKey(@RequestBody BookReq req) {
        return bookServiceImpl.deleteByPrimaryKey(req.getId());
    }

    //根据书籍编号删除书籍
    @RequestMapping(value = "/book/deleteByBookId",method = RequestMethod.POST)
    public int deleteByBookId(@RequestBody BookReq req) {
        return bookServiceImpl.deleteByBookId(req.getBookId());
    }

}
