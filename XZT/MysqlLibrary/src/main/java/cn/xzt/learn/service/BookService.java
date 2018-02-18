package cn.xzt.learn.service;

import cn.xzt.learn.domain.BookDO;
import cn.xzt.learn.domain.condition.BookCondition;
import cn.xzt.learn.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * --Create by xzt-- on 18-1-26
 */
@Service
public class BookService {
    @Resource
    private BookMapper bookMapper;

    public List<BookDO> getAllBooks(int PageSize,int maxPageCount) {
        return bookMapper.selectByExample(new BookCondition());
    }
}
