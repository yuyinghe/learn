package cn.lgw.learn.exception;

public class CommonException extends Exception{
    private int code;

    public CommonException(int code, String message) {
        super(message);
        this.code = code;
    }
}