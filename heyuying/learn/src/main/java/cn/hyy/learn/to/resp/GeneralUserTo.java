package cn.hyy.learn.to.resp;

import lombok.Data;

/**
 * Created by heyuying on 18-4-6
 */
@Data
public class GeneralUserTo {
    private Long userId;
    private String name;
    private Byte sex;
    private Integer school;
    private Integer grade;
}
