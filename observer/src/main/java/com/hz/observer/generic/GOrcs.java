package com.hz.observer.generic;

import com.hz.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * GOrcs.
 *
 * @author hz
 */
@Slf4j
public class GOrcs implements Race {

    @Override
    public void update(GWeather weather, WeatherType weatherType) {
        LOGGER.info("The orcs are facing " + weatherType.getDescription() + " weather now");
    }
}
