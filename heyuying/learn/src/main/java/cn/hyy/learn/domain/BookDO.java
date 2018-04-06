package cn.hyy.learn.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDO {
    /**
     * 自增ID，无意义
     */
    private Long id;

    /**
     * 书籍编号
     */
    private String bookId;

    /**
     * 书籍名称
     */
    private String bookName;

    /**
     * 书籍作者
     */
    private String author;

    /**
     * 书籍分类
     */
    private String catalogue;

    /**
     * 书籍简介
     */
    private String brief;

    /**
     * 可借数量
     */
    private Integer account;
}