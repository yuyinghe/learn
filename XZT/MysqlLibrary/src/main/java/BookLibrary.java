import cn.xzt.learn.Out;
import cn.xzt.learn.domain.BookDO;
import cn.xzt.learn.domain.condition.BookCondition;
import cn.xzt.learn.mapper.BookMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Scanner;

/**
 * --Create by xzt-- on 18-1-25
 */
@Component
public class BookLibrary  {
    @Resource
    BookMapper bookMapper;

    public int selectByPrimaryKey(int i) {
        bookMapper.selectByPrimaryKey(i);
        return i;
    }

    public void updataByPrimaryKey(BookDO book) {
        bookMapper.updateByPrimaryKey(book);
    }

    public void delete(BookCondition bookCondition) {
        bookMapper.deleteByExample( bookCondition);

    }

    public void insert(BookDO bookDO) {
        bookMapper.insert(bookDO);
    }


}

