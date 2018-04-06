package cn.hyy.learn.service;

import cn.hyy.learn.domain.UserDO;
import cn.hyy.learn.exception.CommonException;
import cn.hyy.learn.to.req.UserUpdateReq;
import cn.hyy.learn.to.resp.GeneralUserTo;

import java.util.List;

/**
 * Created by heyuying on 18-3-18
 */

public interface UserService {
    UserDO register(UserDO userDO) throws CommonException;

    List<GeneralUserTo> listUsers(int pageNum, int pageSize);

    UserDO updateUserInfo(UserDO userDO);

    UserDO manageUserInfo(List<UserDO> userList);

    UserDO getUserByUsername(String username);

    UserDO getUserByUserId(Long userId);

    UserDO getCurrentUserInfo();

    UserDO getUserInfoByUsername(String username);

    UserDO getUserInfoByUserId(String userId);
}
