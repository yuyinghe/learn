package cn.hyy.learn.controller;

import cn.hyy.learn.annotation.Auth;
import cn.hyy.learn.converter.UserConvert;
import cn.hyy.learn.enums.RoleEnum;
import cn.hyy.learn.exception.CommonException;
import cn.hyy.learn.service.impl.UserServiceImpl;
import cn.hyy.learn.to.req.UserRegisterReq;
import cn.hyy.learn.to.resp.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


/**
 * Created by heyuying on 18-3-18
 */


@RestController
@Slf4j
public class UserController {

    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public RestResponse register(@RequestBody UserRegisterReq userRegister) throws CommonException {
        return RestResponse.ok(userServiceImpl.register(UserConvert.registerReq2do(userRegister)));
    }

    @Auth(roles = RoleEnum.USER)
    @RequestMapping(value = "/user/current", method = RequestMethod.GET)
    public RestResponse getCurrentUserInfo() {
        return RestResponse.ok(userServiceImpl.getCurrentUserInfo());
    }

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public RestResponse listUsers(int pageNum, int pageSize) {
        return RestResponse.ok(userServiceImpl.listUsers(pageNum, pageSize));
    }





}
