package com.code.datastructuresalgorithms.datastructures.inn;

import lombok.Data;

import java.util.Arrays;

/**
 * @Author 王🍊
 * @Date 2020-11-13 14:57
 * 用数组实现一下栈
 **/
@Data
public class InnWithArray<T> {

    /**
     * 数组存放栈元素
     */
    private T[] array;

    /**
     * 栈大小
     */
    private int size;

    /**
     * 栈内元素个数
     */
    private int number;

    public InnWithArray(int size) {
        this.size = size;
        this.array = (T[]) new Object[size];
        this.number = 0;
    }

    /**
     * 压栈
     * @param t
     */
    public void push(T t) {
        if (number >= size) {
            throw new RuntimeException("栈内存溢出");
        }
        array[number] = t;
        number++;
    }

    /**
     * 出栈
     * @return
     */
    public T pop() {
        int temp = number;
        number--;
        return array[temp-1];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T t : array) {
            stringBuilder.append(t).append(",");
        }
        return stringBuilder.toString();
    }
}
