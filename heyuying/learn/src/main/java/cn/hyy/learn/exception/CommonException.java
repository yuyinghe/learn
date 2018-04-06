package cn.hyy.learn.exception;

/**
 * Created by heyuying on 18-3-18
 */
public class CommonException extends Exception {
    private int code;

    public CommonException(int code, String message) {
        super(message);
        this.code = code;
    }

    public static CommonException create(int code, String message) {
        return new CommonException(code, message);
    }

    public int getCode() {
        return code;
    }
}
