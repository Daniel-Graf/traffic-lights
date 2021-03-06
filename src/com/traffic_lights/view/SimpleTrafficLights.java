package com.traffic_lights.view;

import com.traffic_lights.controller.TrafficLights;

/**
 * A basic TrafficLights implementation that prints every change to its internal state to standard out.
 */
public class SimpleTrafficLights implements TrafficLights {

    private String name;
    private State state;

    public SimpleTrafficLights(String name) {
        this.name = name;
        state = State.Red;
    }

    @Override
    public void turn(State state) {
        this.state = state;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Simple Traffic Lights %s: %s", name, state);
    }
}
