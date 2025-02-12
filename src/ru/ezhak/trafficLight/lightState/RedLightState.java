package ru.ezhak.trafficLight.lightState;
import ru.ezhak.trafficLight.trafficLights.TrafficLight;

public class RedLightState implements TrafficLightState {
    @Override
    public void execute(TrafficLight trafficLight) {
        trafficLight.state = new YellowToGreenState();
        System.out.println("Красный");
    }
}