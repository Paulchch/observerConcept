package com.observer;
/*
 * Este sería como el ISubject
 */
public interface WeatherApp {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate();

}
