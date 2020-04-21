package com.weather.dto;

/**
 * @author hulingxiao
 */
public class FinalDataDTO {
    private String date;
    private String currentTemp;
    private String city;


    @Override
    public String toString() {
        return "FinalDataDTO{" +
                "date='" + date + '\'' +
                ", current_temp='" + currentTemp + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets current temp.
     *
     * @return the current temp
     */
    public String getCurrentTemp() {
        return currentTemp;
    }

    /**
     * Sets current temp.
     *
     * @param currentTemp the current temp
     */
    public void setCurrentTemp(String currentTemp) {
        this.currentTemp = currentTemp;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }
}
