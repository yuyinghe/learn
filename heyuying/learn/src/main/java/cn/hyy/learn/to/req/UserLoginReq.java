package cn.hyy.learn.to.req;

import lombok.Data;

/**
 * Created by heyuying on 18-3-21
 */
@Data
public class UserLoginReq {
    private String username;
    private String password;
    private String code;
}
