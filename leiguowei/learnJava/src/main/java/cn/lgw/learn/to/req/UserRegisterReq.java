package cn.lgw.learn.to.req;

import cn.lgw.learn.enums.SchoolEnum;
import cn.lgw.learn.enums.SexEnum;
import lombok.Data;

@Data
public class UserRegisterReq {
    private String username;
    private String password;
    private int sexCode;
    private SexEnum sex;
    private int schoolCode;
    private SchoolEnum school;
    private int gradeCode;
    private String phone;

    public void setSexCode(int sexCode) {
        this.sexCode = sexCode;
        this.sex = SexEnum.fromCode(sexCode);
    }

    public void setSchoolCode(int schoolCode) {
        this.schoolCode = schoolCode;
        this.school = SchoolEnum.fromCode(schoolCode);
    }
}
