package com.hz.observer2;

/**
 * 关注者，粉丝
 *
 * @author hz
 * @since 2022/10/9
 */
public class Follower implements Observer {

    protected String name;

    public Follower(String name) {
        super();
        this.name = name;
    }

    @Override
    public void notification(String handle, String tweet) {
        System.out.printf("【'%s'】 接收到了来自【'%s'】的消息:, 消息内容: '%s'\n", name, handle, tweet);
    }
}
