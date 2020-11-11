package com.code.datastructuresalgorithms.datastructures.singlylinkedlist;

import lombok.Data;

/**
 * @Author 王🍊
 * @Date 2020-11-10 17:18
 * 单链表
 **/
@Data
public class SinglyLinkList<T> {

    /**
     * 链表头节点
     */
    private SinglyLink<T> head;

    /**
     * 链表尾节点
     */
//    private SinglyLink<T> end;

    /**
     * 正序添加
     * @param t
     * @return
     */
    public SinglyLinkList add(T t) {
        // 空列表
        if (this.head == null) {
            SinglyLink head = new SinglyLink(t);
            this.head = head;
        } else {
            SinglyLink newEnd = new SinglyLink(t);
            SinglyLink node = this.head;
            while (true) {
                if (node.getNext() == null) {
                    node.setNext(newEnd);
                    break;
                }
                node = node.getNext();
            }
        }
        return this;
    }

    /**
     * 逆序添加
     * @param t
     * @return
     */
    public SinglyLinkList inverseAdd(T t) {
        if (this.head == null) {
            SinglyLink head = new SinglyLink(t);
            this.head = head;
        } else {
            SinglyLink newHead = new SinglyLink(t);
            newHead.setNext(this.head);
            this.head = newHead;
        }
        return this;
    }

    /**
     * 删除下标k
     * @param k
     * @return
     */
    public SinglyLinkList delete(int k) {
        if (k < 0) {
            throw new RuntimeException("必须删除大于0的下标");
        }
        if (k >= this.length()) {
            throw new RuntimeException("删除节点超出链表长度");
        }
        if (k == 0) {
            this.head = null;
            return this;
        }
        SinglyLink node = this.head;
        int i = 1;
        while (true) {
            if (k == i) {
                node.setNext(node.getNext().getNext());
                return this;
            }
            node = node.getNext();
            i++;
        }

    }

    /**
     * 获取链表长度
     * @return
     */
    public Long length() {
        SinglyLink node = this.head;
        long length = 0;
        while (node != null) {
            length++;
            node = node.getNext();
        }
        return length;
    }

    /**
     * 查询
     * @param i
     * @return
     */
    public T get(int i) {
        if (this.head == null) {
            return null;
        }
        int length = 0;
        SinglyLink node = this.head;
        while (node != null) {
            if (length == i) {
                return (T) node.getT();
            }
            node = node.getNext();
            length++;
        }
        return null;
    }

    @Override
    public String toString() {
        SinglyLink node = this.head;
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
