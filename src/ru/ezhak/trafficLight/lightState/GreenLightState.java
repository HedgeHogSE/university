package ru.ezhak.trafficLight.lightState;

import ru.ezhak.trafficLight.trafficLights.TrafficLight;

public class GreenLightState implements TrafficLightState {
    @Override
    public void execute(TrafficLight trafficLight) {
        trafficLight.state = new YellowToRedState();
        System.out.println("Зеленый");
    }
}
