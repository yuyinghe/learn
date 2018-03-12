package test;

import cn.lgw.learn.domain.BookDO;
import cn.lgw.learn.domain.condition.BookCondition;
import cn.lgw.learn.mapper.BookMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * Created by leiguowei on 2018/1/22
 */

@Component
public class SpringTest {
    @Resource
    BookMapper bookMapper;

    public void insert(BookDO bookDO) {
        bookMapper.insert(bookDO);
    }

    public List<BookDO> getAllBooks() {
        return bookMapper.selectByExample(new BookCondition());
    }
}