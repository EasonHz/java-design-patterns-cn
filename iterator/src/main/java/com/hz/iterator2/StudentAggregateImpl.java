package com.hz.iterator2;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合角色
 *
 * @author hz
 * @since 2022/10/13
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student stu) {
        list.add(stu);
    }

    @Override
    public void removeStudent(Student stu) {
        list.remove(stu);
    }

    /**
     * 获取迭代器对象
     */
    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}