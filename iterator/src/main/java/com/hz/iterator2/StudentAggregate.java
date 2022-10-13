package com.hz.iterator2;

/**
 * 抽象聚合角色接口
 *
 * @author hz
 * @since 2022/10/13
 */
public interface StudentAggregate {

    /**
     * 添加学生功能
     *
     * @param stu 学生类
     */
    void addStudent(Student stu);

    /**
     * 删除学生功能
     *
     * @param stu 学生类
     */
    void removeStudent(Student stu);

    /**
     * 获取迭代器对象
     *
     * @return 返回迭代器
     */
    StudentIterator getStudentIterator();
}