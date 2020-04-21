package com.weather.service.impl;


import com.weather.dto.ForecastDTO;
import com.weather.dto.TestDTO;
import com.weather.entity.WeatherInfo;
import com.weather.dto.YesterdayDTO;
import com.weather.dto.FinalDataDTO;
import com.weather.service.WeatherService;
import com.weather.util.StringUtil;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author hulingxiao
 */
@Service
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        // Do any additional configuration here
        return builder.build();
    }
    RestTemplate restTemplate = new RestTemplate();
    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
    @Value("status")
    private String fStatus;
    @Value("1000")
    private String statusNum;
    @Value("data")
    private String data;
    @Value("yesterday")
    private String yesterday;
    @Value("forecast")
    private String forecast;
    @Value("ganmao")
    private String ganmao;
    @Value("city")
    private String fCity;
    @Value(("wendu"))
    private String wendu;
    @Override
    public FinalDataDTO getWeatherInfos(String city) {
        try {
            String apiUrl = "http://wthrcdn.etouch.cn/weather_mini?city="+city;
            ResponseEntity<String> orginData =restTemplate.getForEntity(apiUrl, String.class);
            /*获取所有回传信息,存在数据源乱码问题，需先解码*/
            String jsonString = StringUtil.conventFromGzip(orginData.getBody());
//            WeatherInfoDTO weatherInfoDTO = JSONObject.parseObject(jsonString, WeatherInfoDTO.class);
            WeatherInfo weatherInfoDTO = new WeatherInfo();
            net.sf.json.JSONObject str = net.sf.json.JSONObject.fromObject(jsonString);
            /*第一步解析*/
            String status = "";


            if(str.has(fStatus)){
                status = str.get("status").toString();
            }
            if(statusNum.equals(status)){
                if(str.has(data)){
                    /*获取data数据*/
                    net.sf.json.JSONObject str1 = net.sf.json.JSONObject.fromObject(str.get("data"));
                    if(str1.has(yesterday)){
                        /*获取昨天数据*/
                        net.sf.json.JSONObject yy = net.sf.json.JSONObject.fromObject(str1.get("yesterday"));
                        /*set到昨天实体类*/
                        YesterdayDTO yesterdayDTO = new YesterdayDTO();
                        yesterdayDTO.setDate(yy.getString("date"));
                        yesterdayDTO.setFl(yy.getString("fl"));
                        yesterdayDTO.setFx(yy.getString("fx"));
                        yesterdayDTO.setHigh(yy.getString("high"));
                        yesterdayDTO.setLow(yy.getString("low"));
                        yesterdayDTO.setType(yy.getString("type"));

                        weatherInfoDTO.setYesterday(yesterdayDTO);
                    }
                    List<ForecastDTO> forecastDTOList = new ArrayList<ForecastDTO>();
                    if(str1.has(forecast)){
                        //获取预测数组信息
                        JSONArray tempArray = str1.getJSONArray(forecast);
                        for(int i = 0; i < tempArray.size(); i++){
                            net.sf.json.JSONObject temp = JSONObject.fromObject(tempArray.get(i));
                            ForecastDTO f = new ForecastDTO();
                            f.setDate(temp.getString("date"));
                            f.setFengli(temp.getString("fengli"));
                            f.setFengxiang(temp.getString("fengxiang"));
                            f.setHigh(temp.getString("high"));
                            f.setLow(temp.getString("low"));
                            f.setType(temp.getString("type"));
                            System.out.println(f);
                            forecastDTOList.add(f);
                        }
                        weatherInfoDTO.setForecast(forecastDTOList);
                    }
                    if (str1.has(ganmao)){
                        weatherInfoDTO.setGanmao(str1.get("ganmao").toString());
                    }
                    if (str1.has(fCity)){
                        weatherInfoDTO.setCity(str1.get("city").toString());
                    }
                    if(str1.has(wendu)){
                        weatherInfoDTO.setWendu(str1.get("wendu").toString());
                    }
                }
            }
            System.out.println(weatherInfoDTO.toString());
            FinalDataDTO finalDataDTO =new FinalDataDTO();

            finalDataDTO.setCity(weatherInfoDTO.getCity());
            finalDataDTO.setDate(dateFormat.format(date));
            finalDataDTO.setCurrentTemp(weatherInfoDTO.getWendu());
            return finalDataDTO;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
