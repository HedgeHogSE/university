package ru.ezhak.trafficLight.lightState;

import ru.ezhak.trafficLight.trafficLights.TrafficLight;

public interface TrafficLightState {
    void execute (TrafficLight light);
}
