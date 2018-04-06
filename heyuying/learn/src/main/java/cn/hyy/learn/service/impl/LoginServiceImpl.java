package cn.hyy.learn.service.impl;

import cn.hyy.learn.domain.UserDO;
import cn.hyy.learn.domain.condition.UserCondition;
import cn.hyy.learn.mapper.UserMapper;
import cn.hyy.learn.service.LoginService;
import cn.hyy.learn.util.WebContext;
import cn.hyy.learn.vo.LoginUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by heyuying on 18-4-1
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private UserMapper userMapper;

    public LoginUser login(String username, String passport) {
        UserCondition condition = new UserCondition();
        condition.createCriteria()
                .andUsernameEqualTo(username)
                .andPasswordEqualTo(passport);
        List<UserDO> userDOList = userMapper.selectByExample(condition);
        if (userDOList.size() == 0) {
            return null;
        }
        LoginUser loginUser = LoginUser.fromUserDO(userDOList.get(0));

        HttpSession session = WebContext.request.get().getSession();
        session.setAttribute("isLoggedIn", "true");

        session.setAttribute("name", loginUser.getName());
        session.setAttribute("username", loginUser.getUsername());
        session.setAttribute("userId", loginUser.getUserId());

        return loginUser;
    }

    public void logout() {
        HttpSession session = WebContext.request.get().getSession();
        session.removeAttribute("isLoggedIn");
    }
}
