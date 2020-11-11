package com.code.datastructuresalgorithms.practice;

import com.alibaba.fastjson.JSON;
import com.code.datastructuresalgorithms.datastructures.singlylinkedlist.SinglyLinkList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 王🍊
 * @Date 2020-11-10 17:13
 **/
public class LinkedListTest {

    public static void main(String[] args) {
        SinglyLinkList<Integer> singlyLinkList = new SinglyLinkList<>();
        singlyLinkList.add(1).add(2).add(3);
        Integer a = singlyLinkList.get(2);
        System.out.println(a);
    }

}
