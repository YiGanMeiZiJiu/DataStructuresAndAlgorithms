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
    private SinglyLink<T> end;

    /**
     * 新增
     * @param t
     * @return
     */
    public SinglyLinkList add(T t) {
        // 空列表
        if (this.head == null) {
            SinglyLink head = new SinglyLink(t);
            this.head = head;
        } else if (this.head != null && this.end == null) {
            SinglyLink next = new SinglyLink(t);
            this.head.setNext(next);
            this.end = next;
        } else {
            SinglyLink newEnd = new SinglyLink(t);
            SinglyLink oldEnd = this.end;
            oldEnd.setNext(newEnd);
            this.end = newEnd;
        }
        return this;
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
