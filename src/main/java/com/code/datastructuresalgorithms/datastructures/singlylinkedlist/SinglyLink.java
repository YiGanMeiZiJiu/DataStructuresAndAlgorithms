package com.code.datastructuresalgorithms.datastructures.singlylinkedlist;

import lombok.Data;

/**
 * @Author 王🍊
 * @Date 2020-11-10 17:04
 * 单向链表节点
 **/
@Data
public class SinglyLink<T> {

    private T t;

    private SinglyLink next;

    public SinglyLink(T t) {
        this.t = t;
    }

}
