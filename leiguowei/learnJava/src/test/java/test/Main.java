package test;

import cn.lgw.learn.enums.SexEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

/**
 * 
 * Created by leiguowei on 2018/1/22
 */
@Slf4j
public class Main implements Cloneable{
    int a = 5;

    public static void main(String[] args) throws CloneNotSupportedException {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}