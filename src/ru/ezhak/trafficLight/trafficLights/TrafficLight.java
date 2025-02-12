package ru.ezhak.trafficLight.trafficLights;

import ru.ezhak.trafficLight.lightState.RedLightState;
import ru.ezhak.trafficLight.lightState.TrafficLightState;

public class TrafficLight{
    public TrafficLightState state = new RedLightState();
    public void next() {
        state.execute(this);
    }


}