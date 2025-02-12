package ru.ezhak.trafficLight.lightState;
import ru.ezhak.trafficLight.trafficLights.TrafficLight;

public class YellowToRedState implements TrafficLightState {
    @Override
    public void execute(TrafficLight trafficLight) {
        trafficLight.state = new RedLightState();
        System.out.println("Желтый");
    }
}
