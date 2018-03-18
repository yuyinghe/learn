package cn.lgw.learn.service;

import cn.lgw.learn.domain.UserDO;
import cn.lgw.learn.to.req.UserRegisterReq;

public interface UserService {
    boolean register(UserRegisterReq userRegister);

    boolean login(String username, String password);

    UserDO updateUserInfo();
}
