package com.example.dmiprojekt3;

public class Station {


    String stationID;
    String stationName;
    String lngLat;
    String height;
    String setup;



    public Station(String stationID, String stationName, String lngLat, String height, String setup) {

        this.stationID = stationID;
        this.stationName = stationName;
        this.lngLat = lngLat;
        this.height = height;
        this.setup = setup;
    }

    @Override
    public String toString() {
        return stationName;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {

    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getLngLat() {
        return lngLat;
    }

    public void setLngLat(String lngLat) {
        this.lngLat = lngLat;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height){

        }



    public String getSetup() {
        return setup;
    }

    public void setSetupDate(String setup) {
        this.setup = setup;
    }
/*
    public void addWeatherData(WeatherData weatherData) {
        this.weatherData.add(weatherData);
    }

    public LinkedList<WeatherData> getWeatherData() {
        return this.weatherData;
    }
*/
}
