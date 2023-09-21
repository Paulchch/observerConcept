package com.observer;

import java.util.ArrayList;
import java.util.List;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Weather weather = new Weather();
        WeatherDisplay weatherDisplay = new WeatherDisplay(weather);
        weather.attach(weatherDisplay);
        weather.setTiempo("Lluvioso");
        weather.setGrados(19);
        
        weather.setGrados(20);
        weather.setTiempo("nublado");



    }
}
