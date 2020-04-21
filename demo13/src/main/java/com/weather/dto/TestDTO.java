package com.weather.dto;

/**
 * @author hulingxiao
 */
public class TestDTO {
    String city;

    @Override
    public String toString() {
        return "TestDTO{" +
                "city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
