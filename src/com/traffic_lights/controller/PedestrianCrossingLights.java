package com.traffic_lights.controller;

/**
 * The Inteface for PedestrianCrossingLights used by the controller and provides by view components.
 */
public interface PedestrianCrossingLights {

    /**
     * The possible states of PedestrianCrossingLights.
     */
    public enum State {
        Red,
        Green,
        Off
    }

    /**
     * Switches the PedestrianCrossingLights to the given state.
     *
     * @param state The new state for the PedestrianCrossingLights.
     */
    public void turn(State state);
}

