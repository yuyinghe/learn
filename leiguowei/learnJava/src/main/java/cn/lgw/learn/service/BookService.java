package cn.lgw.learn.service;

import cn.lgw.learn.domain.BookDO;
import cn.lgw.learn.domain.condition.BookCondition;
import cn.lgw.learn.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.print.Book;
import java.util.List;

/**
 * 
 * Created by leiguowei on 2018/1/26
 */
@Service
public class BookService {
    @Resource
    private BookMapper bookMapper;

    public List<BookDO> getAllBooks(int pageSize, int maxPageCount) {
        return bookMapper.selectByExample(new BookCondition());
    }
}