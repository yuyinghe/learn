package cn.cooper.uestc.service;


import cn.cooper.uestc.domain.BookDo;
import cn.cooper.uestc.domain.condition.BookCondition;
import cn.cooper.uestc.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.print.Book;
import java.util.List;

/**
 * By GuPei 18-1-26
 */
@Service
//和component起的效果差不多，建议使用service。，
public class BookService {
    @Resource
    private BookMapper bookMapper;

    public List<BookDo> getAllBooks(int pageSize,int maxPageCount) {
        //selectByExample是查询方法,查询方法里面的参数是满足条件的BookCondition对象
        //一般都对BookConditiond对象进行了条件设置，具体在main方法里，此处没有设置对象条件。
        return bookMapper.selectByExample(new BookCondition());
    }
}
