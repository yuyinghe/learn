package cn.hyy.learn.vo;


import lombok.Data;

/**
 * Created by heyuying on 18-1-26
 */
@Data
public class BookReq {
    int pageSize;
    int maxPageCount;
    long id;
    String bookId;
    String bookName;
    String author;
    String catalogue;
    String brief;
    int account;
}
