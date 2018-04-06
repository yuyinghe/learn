package cn.hyy.learn.service;

import cn.hyy.learn.domain.BookDO;
import cn.hyy.learn.vo.BookReq;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by heyuying on 18-3-18
 */

public interface BookService {
    //查询全部书籍
    List<BookDO> getAllBooks(int pageSize, int maxPageCount);
    //按书名查询书籍
    List<BookDO> getSelectBooks(String name);
    //根据id查询书籍
    BookDO selectByPrimaryKey(long id);
    //按书籍编号查询
    List<BookDO> getSelectBooksByBookId(String bookId);
    //整本书插入
    int insert(BookReq req);
    //更新
    int update(BookReq req);

    //根据ID删除一本书
    int deleteByPrimaryKey(long id);
    //根据书籍编号删除书籍
    int deleteByBookId(String bookId);
}
