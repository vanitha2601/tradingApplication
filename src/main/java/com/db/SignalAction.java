package com.db;

import java.util.List;

/**
 * Author: Vanithasri
 * Description: This class represents a trading signal and its associated actions.
 */
public class SignalAction {
    private int signal;
    private List<String> actions;

    // Getters and setters
    public int getSignal() {
        return signal;
    }

    public void setSignal(int signal) {
        this.signal = signal;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }
}
