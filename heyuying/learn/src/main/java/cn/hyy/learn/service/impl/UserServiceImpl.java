package cn.hyy.learn.service.impl;

import cn.hyy.learn.domain.UserDO;
import cn.hyy.learn.domain.condition.UserCondition;
import cn.hyy.learn.enums.ExceptionEnum;
import cn.hyy.learn.exception.CommonException;
import cn.hyy.learn.mapper.MUserMapper;
import cn.hyy.learn.mapper.UserMapper;
import cn.hyy.learn.service.UserService;
import cn.hyy.learn.to.resp.GeneralUserTo;
import cn.hyy.learn.util.LoginContext;
import com.github.pagehelper.PageHelper;
import com.google.common.base.Strings;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;



@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private MUserMapper mUserMapper;

    public UserDO register(UserDO userDO) throws CommonException {
       UserCondition condition = new UserCondition();
        condition.createCriteria()
                .andUsernameEqualTo(userDO.getUsername());
        if (userMapper.selectByExample(condition).size() != 0) {
            throw ExceptionEnum.USER_EXIST.getException();
        }
        condition = new UserCondition();
        condition.createCriteria()
                .andPhoneEqualTo(userDO.getPhone());
        if (userMapper.selectByExample(condition).size() != 0) {
            throw ExceptionEnum.USER_PHONE_EXIST.getException();
        }
        userMapper.insert(userDO);
        return getUserInfoByUsername(userDO.getUsername());
    }

    public List<GeneralUserTo> listUsers(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mUserMapper.selectGeneralByExample(new UserCondition());
    }

    public UserDO updateUserInfo(UserDO userDO) {
        String username = LoginContext.username.get();
        if (Strings.isNullOrEmpty(username)) {
            return null;
        }
        UserCondition condition = new UserCondition();
        condition.createCriteria()
                .andUsernameEqualTo(username);
        userMapper.updateByExampleSelective(userDO, condition);

        return getUserInfoByUsername(username);
    }

    public UserDO manageUserInfo(List<UserDO> userList) {
        return null;
    }

    public UserDO getUserByUsername(String username) {
        if (Strings.isNullOrEmpty(username)) {
            return null;
        }
        UserCondition condition = new UserCondition();
        condition.createCriteria()
                .andUsernameEqualTo(username);
        List<UserDO> user = userMapper.selectByExample(condition);
        if (user.size() == 0) {
            return null;
        }
        return user.get(0);
    }

    public UserDO getUserByUserId(Long userId) {
        if (userId == null) {
            return null;
        }
        UserCondition condition = new UserCondition();
        condition.createCriteria()
                .andUserIdEqualTo(userId);

        List<UserDO> user = userMapper.selectByExample(condition);
        if (user.size() == 0) {
            return null;
        }
        return user.get(0);
    }

    public UserDO getCurrentUserInfo() {
        String username = LoginContext.username.get();
        if (Strings.isNullOrEmpty(username)) {
            return null;
        }

        UserCondition condition = new UserCondition();
        condition.createCriteria()
                .andUsernameEqualTo(username);

        return userMapper.selectByExample(condition).get(0);
    }

    public UserDO getUserInfoByUsername(String username) {
        return null;
    }

    public UserDO getUserInfoByUserId(String userId) {
        return null;
    }
}

