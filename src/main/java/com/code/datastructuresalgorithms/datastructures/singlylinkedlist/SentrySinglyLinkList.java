package com.code.datastructuresalgorithms.datastructures.singlylinkedlist;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.LinkedList;

/**
 * @Author 王🍊
 * @Date 2020-11-11 19:44
 * 利用哨兵实现单链表
 **/
@Data
public class SentrySinglyLinkList<T> {

    /**
     * 哨兵
     */
    private SinglyLink<T> sentry;

    public SentrySinglyLinkList() {
        this.sentry = new SinglyLink<>(null);
    }

    /**
     * 逆序头节点添加
     * @param t
     * @return
     */
    public SentrySinglyLinkList inverseAdd(T t) {
        SinglyLink node = new SinglyLink(t);
        node.setNext(this.sentry.getNext());
        this.sentry.setNext(node);
        return this;
    }

    /**
     * 正序添加
     * @param t
     * @return
     */
    public SentrySinglyLinkList add(T t) {
        getSinglyLink(length() - 1).setNext(new SinglyLink(t));
        return this;
    }

    /**
     * 按下标获取
     * @param i
     * @return
     */
    public SinglyLink getSinglyLink(int i) {
        if (i == -1) {
            return this.sentry;
        }
        if (i < 0 || i > length()) {
            return null;
        }
        int temp = 0;
        SinglyLink node = sentry.getNext();
        while (node != null) {
            if (i == temp) {
                return node;
            }
            node = node.getNext();
            temp++;
        }
        return null;
    }

    /**
     * 按下标获取
     * @param i
     * @return
     */
    public T get(int i) {
        SinglyLink node = getSinglyLink(i);
        return node == null ? null : (T) node.getT();
    }

    /**
     * 长度获取
     * @return
     */
    public Integer length() {
        SinglyLink node = sentry.getNext();
        int length = 0;
        while (node != null) {
            length++;
            node = node.getNext();
        }
        return length;
    }

    /**
     * 删除
     * @param i
     * @return
     */
    public SentrySinglyLinkList delete(int i) {
        getSinglyLink(i-1).setNext(getSinglyLink(i+1));
        return this;
    }

    @Override
    public String toString() {
        SinglyLink node = this.sentry.getNext();
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.getT());
            node = node.getNext();
            if (node != null) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

}
