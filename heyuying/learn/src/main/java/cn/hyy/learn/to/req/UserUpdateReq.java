package cn.hyy.learn.to.req;

import cn.hyy.learn.enums.SchoolEnum;
import cn.hyy.learn.enums.SexEnum;
import lombok.Data;

/**
 * Created by heyuying on 18-3-21
 */
@Data
public class UserUpdateReq {
    private String name;
    private String password;
    private Integer sex;
    private Integer school;
    private Integer grade;
    private String phone;
    private Integer status;
    private Integer borrowAmount;
    private Integer canBorrowAmount;
}
