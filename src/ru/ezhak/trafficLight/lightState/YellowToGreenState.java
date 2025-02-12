package ru.ezhak.trafficLight.lightState;

import ru.ezhak.trafficLight.trafficLights.TrafficLight;

public class YellowToGreenState implements TrafficLightState {
    @Override
    public void execute(TrafficLight trafficLight) {
        trafficLight.state = new GreenLightState();
        System.out.println("Желтый");
    }
}
