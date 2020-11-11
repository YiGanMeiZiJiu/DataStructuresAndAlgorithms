package com.code.datastructuresalgorithms.algorithms.LRU;

import com.code.datastructuresalgorithms.datastructures.singlylinkedlist.SinglyLinkList;

/**
 * @Author 王🍊
 * @Date 2020-11-11 14:33
 * LRU单链表缓存淘汰算法
 **/
public class LRU<T> {

    /**
     * 缓存最大长度
     */
    private static final Long MAX_CACHE_LENGTH = 4L;

    private SinglyLinkList<T> list;

    private SinglyLinkList<T> getList() {
        return list;
    }

    private void setList(SinglyLinkList<T> list) {
        this.list = list;
    }

    public LRU() {
        this.list = new SinglyLinkList<>();
    }

    public T getCache(T t) {
        int site;
        // 已经缓存了此数据
        for (int i = 0; i < list.length(); i++) {
            if (list.get(i).equals(t)) {
                list.delete(i);
                list.inverseAdd(t);
                return t;
            }
        }
        // 尚未缓存此数据
        if (list.length() >= MAX_CACHE_LENGTH) {
            // 删除尾部节点，并将新缓存插入头节点
            list.delete(list.length().intValue() - 1);
        }
        // 直接将新缓存插入头节点
        list.inverseAdd(t);
        return t;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
