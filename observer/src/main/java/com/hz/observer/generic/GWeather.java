package com.hz.observer.generic;

import com.hz.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * GWeather.
 * 被观察者
 *
 * @author hz
 */
@Slf4j
public class GWeather extends Observable<GWeather, Race, WeatherType> {

    private WeatherType currentWeather;

    public GWeather() {
        currentWeather = WeatherType.SUNNY;
    }

    /**
     * 随着时间的流逝，天气一直在变化
     */
    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        LOGGER.info("The weather changed to {}.", currentWeather);
        notifyObservers(currentWeather);
    }
}
