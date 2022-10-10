package com.hz.observer.generic;

import com.hz.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * GHobbits.
 *
 * @author hz
 */
@Slf4j
public class GHobbits implements Race {

    @Override
    public void update(GWeather weather, WeatherType weatherType) {
        LOGGER.info("The hobbits are facing " + weatherType.getDescription() + " weather now");
    }
}
