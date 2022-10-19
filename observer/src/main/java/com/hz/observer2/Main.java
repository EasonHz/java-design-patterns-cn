package com.hz.observer2;

/**
 * @author hz
 * @since 2022/10/9
 */
public class Main {
    public static void main(String args[]) {

        PublicFigure bobama = new PublicFigure("Barack Obama", "bobama");
        PublicFigure nmodi = new PublicFigure("Narendra Modi", "nmodi");

        Follower ajay = new Follower("Ajay");
        Follower vijay = new Follower("Vijay");
        Follower zhangsan = new Follower("Racheal");
        Follower micheal = new Follower("Micheal");
        Follower kim = new Follower("Kim");

        bobama.addSubscriber(ajay);
        bobama.addSubscriber(vijay);
        bobama.addSubscriber(zhangsan);
        bobama.addSubscriber(micheal);
        bobama.addSubscriber(kim);
        bobama.tweet("你好 朋友!");

        nmodi.addSubscriber(ajay);
        nmodi.addSubscriber(vijay);
        nmodi.addSubscriber(zhangsan);
        nmodi.addSubscriber(micheal);
        nmodi.addSubscriber(kim);

        nmodi.tweet("Vande Matram!");

        bobama.removeSubscriber(zhangsan);

        bobama.tweet("Stay Home! Stay Safe!");
    }
}
