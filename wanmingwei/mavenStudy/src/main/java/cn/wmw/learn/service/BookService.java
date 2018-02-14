package cn.wmw.learn.service;

import cn.wmw.learn.domain.BookDO;
import cn.wmw.learn.domain.condition.BookCondition;
import cn.wmw.learn.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mingwei on 18-1-26
 */
@Service
public class BookService {
    @Resource
    private BookMapper bookMapper;
    public List<BookDO> getAllBooks(int pageSize, int maxPageCount) {
        return bookMapper.selectByExample(new BookCondition());
    }
}
