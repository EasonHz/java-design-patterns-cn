package com.hz.iterator2;

/**
 * 抽象迭代器角色接口
 *
 * @author hz
 * @since 2022/10/13
 */
public interface StudentIterator {

    /**
     * 判断是否还有元素
     *
     * @return 布尔
     */
    boolean hasNext();


    /**
     * 获取下一个元素
     *
     * @return 学生
     */
    Student next();
}