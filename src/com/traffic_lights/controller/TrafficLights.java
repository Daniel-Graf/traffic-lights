package com.traffic_lights.controller;

/**
 * The Interface for TrafficLights used by the Controller and provided by view components.
 */
public interface TrafficLights {

    /**
     * The possible states of TrafficLights.
     */
    public enum State {
        Red,
        Green,
        Yellow,
        RedYellow,
        Off,
        Flash
    }

    /**
     * Switches the TrafficLights to the given state.
     *
     * @param state The new state of the TrafficLights.
     */
    public void turn(State state);
}
