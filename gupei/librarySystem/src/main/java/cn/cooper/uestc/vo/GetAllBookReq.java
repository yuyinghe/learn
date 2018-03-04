package cn.cooper.uestc.vo;


import lombok.Data;

/**
 * By GuPei 18-1-26
 */
@Data
//Data注解帮助对属性进行set,get方法，并且也重写好了toString()方法。
public class GetAllBookReq {
    int pageSize;
    int maxPageCount;
}
