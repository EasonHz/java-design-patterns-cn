package com.hz.iterator2;

import java.util.List;

/**
 * 具体迭代器角色类
 *
 * @author hz
 * @since 2022/10/13
 */
public class StudentIteratorImpl implements StudentIterator {

    private final List<Student> list;
    /**
     * 用来记录遍历时的位置
     */
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        //从集合中获取指定位置的元素
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}