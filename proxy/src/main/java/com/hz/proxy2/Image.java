package com.hz.proxy2;

/**
 * @author hz
 * @since 2022/10/10
 */
public interface Image {

    /**
     * 加载图片
     */
    void load();

    /**
     * 展示图片
     */
    void show();

    /**
     * 展示图片描述信息
     */
    void showSummary();

    /**
     * 调整图片大小
     */
    void resize();

    /**
     * 删除图片
     */
    void remove();

    /**
     * 关闭
     */
    void close();
}
