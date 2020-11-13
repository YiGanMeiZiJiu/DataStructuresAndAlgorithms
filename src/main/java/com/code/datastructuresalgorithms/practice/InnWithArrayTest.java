package com.code.datastructuresalgorithms.practice;

import com.code.datastructuresalgorithms.datastructures.inn.InnWithArray;

/**
 * @Author 王🍊
 * @Date 2020-11-13 17:55
 **/
public class InnWithArrayTest {

    public static void main(String[] args) {
        InnWithArray<String> innWithArray = new InnWithArray<>(5);
        innWithArray.push("a");
        innWithArray.push("b");
        innWithArray.push("c");
        innWithArray.push("d");
        innWithArray.push("e");
        System.out.println(innWithArray.toString());
        for (int i = 0; i < 5; i++) {
            System.out.println(innWithArray.pop());
        }
    }
}
