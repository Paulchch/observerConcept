package com.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * Este sería el concrete subject
 */
public class Weather implements WeatherApp {
    private String tiempo;
    private double grados;
    private List<Observer> observers;
    
    public Weather() {
        observers = new ArrayList<>();

    }
    
    public String getTiempo() {
        return tiempo;
    }

    public double getGrados() {
        return grados;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
        
    }
    @Override
    public void detach(Observer o) {
        observers.remove(o);
        
    }
    @Override
    public void notifyUpdate() {
        for (Observer observer : observers) {
            observer.update();
        }
        
    }
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
        notifyUpdate();
    }
    public void setGrados(double grados) {
        this.grados = grados;
        notifyUpdate();
    }
    public void setObservers(List<Observer> observers) {
        this.observers = observers;
        notifyUpdate();
    }
    
}
