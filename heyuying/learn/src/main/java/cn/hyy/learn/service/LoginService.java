package cn.hyy.learn.service;

import cn.hyy.learn.vo.LoginUser;

/**
 * Created by heyuying on 18-4-1
 */
public interface LoginService {

    LoginUser login(String username, String passport);

    void logout();
}
