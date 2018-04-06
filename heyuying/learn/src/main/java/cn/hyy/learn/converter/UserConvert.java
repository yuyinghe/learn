package cn.hyy.learn.converter;

import cn.hyy.learn.domain.UserDO;
import cn.hyy.learn.to.req.UserRegisterReq;
import cn.hyy.learn.to.resp.GeneralUserTo;

/**
 * Created by heyuying on 18-3-18
 */
public class UserConvert {

    public static UserDO registerReq2do(UserRegisterReq from) {
        UserDO to = new UserDO();

        to.setName(from.getName());
        to.setUsername(from.getUsername());
        to.setPassword(from.getPassword());
        to.setStuId(from.getStuId());
        to.setSchool(from.getSchool());
        to.setGrade(from.getGrade());
        to.setPhone(from.getPhone());
        if (from.getSex() != null) {
            to.setSex(from.getSex().byteValue());
        }
        return to;
    }

    public static GeneralUserTo do2generalTo(UserDO from) {
        GeneralUserTo to = new GeneralUserTo();

        to.setUserId(from.getUserId());
        to.setName(from.getName());
        to.setGrade(from.getGrade());
        to.setSchool(from.getSchool());
        to.setSex(from.getSex());
        return to;
    }

}
