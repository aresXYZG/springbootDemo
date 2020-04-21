package com.weather.entity;

import com.weather.dto.ForecastDTO;
import com.weather.dto.YesterdayDTO;

import java.util.List;

/**
 * @author hulingxiao
 */
public class WeatherInfo {

    /**昨天天气*/
    private YesterdayDTO yesterday;
    /**未来五日天气预测*/
    private List<ForecastDTO> forecast;
    /**城市*/
    private String city;
    /**天气造成感冒概率*/
    private String ganmao;
    /**今天气温*/
    private String wendu;


    @Override
    public String toString() {
        return "WeatherInfo{" +
                "yesterday=" + yesterday +
                ", forecast=" + forecast +
                ", city='" + city + '\'' +
                ", ganmao='" + ganmao + '\'' +
                ", wendu='" + wendu + '\'' +
                '}';
    }

    public YesterdayDTO getYesterday() {
        return yesterday;
    }

    public void setYesterday(YesterdayDTO yesterday) {
        this.yesterday = yesterday;
    }

    public List<ForecastDTO> getForecast() {
        return forecast;
    }

    public void setForecast(List<ForecastDTO> forecast) {
        this.forecast = forecast;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }


    ////    接口返回状态代码
//    private String status;
////    接口是否正常
//    private String desc;


}


