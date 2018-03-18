package cn.lgw.learn.enums;

public enum ExceptionEnum {
    //用户相关异常
    USER_EXIST(10010, "用户已存在")
    ;


    private int code;
    private String message;

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
