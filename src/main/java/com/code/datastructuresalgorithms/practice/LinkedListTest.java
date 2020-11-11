package com.code.datastructuresalgorithms.practice;

import com.alibaba.fastjson.JSON;
import com.code.datastructuresalgorithms.algorithms.LRU.LRU;
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
        singlyLinkList.inverseAdd(4);
        System.out.println(singlyLinkList.toString());
        System.out.println(singlyLinkList.length());
        singlyLinkList.delete(4);
        System.out.println(singlyLinkList.toString());

        LRU<String> lru = new LRU<>();
        lru.getCache("test");
        lru.getCache("abc");
        lru.getCache("111");
        lru.getCache("qwe");
        lru.getCache("asdf");
        lru.getCache("111");
        System.out.println(lru.toString());
    }

}
