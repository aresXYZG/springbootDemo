package com.weather.controller;

import com.weather.dto.FinalDataDTO;
import com.weather.dto.TestDTO;
import com.weather.service.WeatherService;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * @author hulingxiao
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Resource
    private WeatherService weatherService;

    @PostMapping("getWeatherInfos")
    public FinalDataDTO getWeatherInfos(@RequestBody String string) {

        String city = null;
        JSONObject a = JSONObject.fromObject(string);
        System.out.println(a);
        String key = "city";
        if(a.has(key)){
             city = a.get("city").toString();
        }
        return weatherService.getWeatherInfos(city);
    }
}
