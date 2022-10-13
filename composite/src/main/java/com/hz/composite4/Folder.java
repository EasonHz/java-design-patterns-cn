package com.hz.composite4;

import java.util.ArrayList;

/**
 * 文件夹类
 *
 * @author hz
 */
public class Folder extends AbstractFile {

    private final String name;

    private final ArrayList<AbstractFile> fileList = new ArrayList<>();

    Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒！");
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
