package cn.hyy.library;

import cn.hyy.library.domain.BookDo;
import cn.hyy.library.domain.condition.BookCondition;
import cn.hyy.library.mapper.BookMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * Created by heyuying on 18-2-14
 */
@Component
public class SpringTest {
    @Resource
    BookMapper bookMapper;

    public BookDo selectByPrimaryKey(Long id) {
        return bookMapper.selectByPrimaryKey(id);
    }
    public List<BookDo> selectByExample(BookCondition example) {
        return bookMapper.selectByExample(example);

    }


    public void deleteByPrimaryKey(long id)
    {
        bookMapper.deleteByPrimaryKey(id);
    }





}
