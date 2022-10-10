package com.hz.observer;

import com.hz.observer.generic.GHobbits;
import com.hz.observer.generic.GOrcs;
import com.hz.observer.generic.GWeather;
import lombok.extern.slf4j.Slf4j;

/**
 * The Observer pattern is a software design pattern in which an object, called the subject,
 * maintains a list of its dependents, called observers, and notifies them automatically of any
 * state changes, usually by calling one of their methods. It is mainly used to implement
 * distributed event handling systems. The Observer pattern is also a key part in the familiar
 * model–view–controller (MVC) architectural pattern. The Observer pattern is implemented in
 * numerous programming libraries and systems, including almost all GUI toolkits.
 *
 * <p>In this example {@link Weather} has a state that can be observed. The {@link Orcs} and {@link
 * Hobbits} register as observers and receive notifications when the {@link Weather} changes.
 *
 * @author hz
 */
@Slf4j
public class App {

    public static void main(String[] args) {

        var weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
//        System.out.println();
//
//        //通用的观察者模式
//        LOGGER.info("--Running generic version--");
//        var genericWeather = new GWeather();
//        genericWeather.addObserver(new GOrcs());
//        genericWeather.addObserver(new GHobbits());
//
//        genericWeather.timePasses();
//        genericWeather.timePasses();
//        genericWeather.timePasses();
//        genericWeather.timePasses();
    }
}
