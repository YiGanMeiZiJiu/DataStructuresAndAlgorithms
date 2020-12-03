package com.code.datastructuresalgorithms.datastructures.inn;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: 小王
 * Date: 2020-12-02
 * Time: 19:54
 * Description: 链表实现一个栈
 */
public class InnWithLink<T> {

    /**
     * 链表
     */
    private LinkedList<T> list;

    /**
     * 栈内元素个数
     */
    private int number;

    /**
     * 压栈
     * @param t
     */
    public void push(T t) {
        list.push(t);
        number++;
    }

    /**
     * 出栈
     * @return
     */
    public T pop() {
        if (number <= 0) {
            throw new RuntimeException("栈空");
        }
        number--;
        return list.pop();
    }

}
