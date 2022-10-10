package com.hz.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 兽人
 *
 * @author hz
 */
@Slf4j
public class Orcs implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        LOGGER.info("兽人现在面临着 {} 的天气", currentWeather.getDescription());
    }
}
