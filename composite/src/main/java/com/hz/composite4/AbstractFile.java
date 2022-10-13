package com.hz.composite4;

/**
 * 抽象文件类
 *
 * @author hz
 */
public abstract class AbstractFile {
    /**
     * 添加文件
     *
     * @param file 文件
     */
    public abstract void add(AbstractFile file);

    /**
     * 删除文件
     *
     * @param file 文件
     */
    public abstract void remove(AbstractFile file);

    /**
     * 获取第i个文件
     *
     * @param i 文件序号
     * @return 返回文件
     */
    public abstract AbstractFile getChild(int i);

    /**
     * 业务方法：杀毒
     */
    public abstract void killVirus();
}
