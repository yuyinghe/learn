package cn.hyy.learn.controller;

import cn.hyy.learn.service.impl.LoginServiceImpl;
import cn.hyy.learn.to.req.UserLoginReq;
import cn.hyy.learn.to.resp.RestResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


/**
 * Created by heyuying on 18-4-1
 */
@RestController
public class LoginController {

    @Resource
    private LoginServiceImpl loginServiceImpl;

    @RequestMapping("/login")
    public RestResponse login(UserLoginReq req)  {
        return RestResponse.ok(loginServiceImpl.login(req.getUsername(), req.getPassword()));
    }

    @RequestMapping("/logout")
    public RestResponse logout() {
        loginServiceImpl.logout();
        return RestResponse.ok();
    }



}
