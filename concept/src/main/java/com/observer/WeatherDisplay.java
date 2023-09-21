package com.observer;

/*
 * Este sería el observer
 */
public class WeatherDisplay implements Observer{
    private Weather weather;
    private String estadoClima;
    private double gradosCentigrados;

    
    public WeatherDisplay(Weather weatherStation) {
        this.weather = weatherStation;
    }

    public void update(){
        
        estadoClima = this.weather.getTiempo();
        gradosCentigrados = this.weather.getGrados();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "WeatherDisplay [estadoClima=" + estadoClima + ", gradosCentigrados=" + gradosCentigrados + "]";
    }
    
}
