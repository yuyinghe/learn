package cn.hyy.learn.service.impl;

import cn.hyy.learn.domain.BookDO;
import cn.hyy.learn.domain.condition.BookCondition;
import cn.hyy.learn.mapper.BookMapper;
import cn.hyy.learn.service.BookService;
import cn.hyy.learn.vo.BookReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by heyuying on 18-3-18
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    //查询全部书籍
    public List<BookDO> getAllBooks(int pageSize, int maxPageCount) {
        BookCondition example = new BookCondition();
        example.createCriteria().andIdIsNotNull();
        return bookMapper.selectByExample(example);
    }

    //按书名查询书籍
    public List<BookDO> getSelectBooks(String name) {
        BookCondition example = new BookCondition();
        example.createCriteria().andBookNameEqualTo(name);
        return bookMapper.selectByExample(example);
    }

    //根据id查询书籍
    public BookDO selectByPrimaryKey(long id) {
        return bookMapper.selectByPrimaryKey(id);
    }



    //按书籍编号查询
    public List<BookDO> getSelectBooksByBookId(String bookId) {
        BookCondition example = new BookCondition();
        example.createCriteria().andBookIdEqualTo(bookId);
        return bookMapper.selectByExample(example);
    }

    //插入
    public int insert(BookReq req) {
        BookDO bookDO = new BookDO();
        bookDO.setBookId(req.getBookId());
        bookDO.setBookName(req.getBookName());
        bookDO.setAuthor(req.getAuthor());
        bookDO.setCatalogue(req.getCatalogue());
        bookDO.setBrief(req.getBrief());
        bookDO.setAccount(req.getAccount());
        return bookMapper.insert(bookDO);
    }

    //更新书籍
    public int update(BookReq req) {
        BookDO bookDO = selectByPrimaryKey(req.getId());//先找到要更新的书籍
        if (req.getBookName() != null) {
            bookDO.setBookName(req.getBookName());
        }
        if (req.getAuthor() != null) {
            bookDO.setAuthor(req.getAuthor());
        }
        if (req.getCatalogue() != null) {
            bookDO.setCatalogue(req.getCatalogue());
        }
        if (req.getBrief()!=null) {
            bookDO.setBrief(req.getBrief());
        }
        return bookMapper.updateByPrimaryKey(bookDO);
    }

    //根据ID删除一本书
    public int deleteByPrimaryKey(long id) {
        return bookMapper.deleteByPrimaryKey(id);
    }

    //根据书籍编号删除书籍
    public int deleteByBookId(String bookId) {
        BookCondition example = new BookCondition();
        example.createCriteria().andBookIdEqualTo(bookId);
        return bookMapper.deleteByExample(example);
    }
}
