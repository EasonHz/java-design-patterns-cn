package com.hz.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 霍比特人
 *
 * @author hz
 */
@Slf4j
public class Hobbits implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        LOGGER.info("霍比特人现在面临着 {} 的天气", currentWeather.getDescription());
    }
}
