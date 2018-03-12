package test;

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
        Parent[] parents = {new Child(), new Child()};

        Child[] children = (Child[]) parents;

        System.out.println(children[0]);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}