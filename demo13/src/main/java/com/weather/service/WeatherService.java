package com.weather.service;



import com.weather.dto.FinalDataDTO;
import com.weather.dto.TestDTO;

import java.util.List;

/**
 * @author hulingxiao
 */
public interface WeatherService {

    /**
     * Gets weather infos.
     *
     * @param city the city
     * @return the weather infos
     */
    FinalDataDTO getWeatherInfos(String city);


}

