package com.db;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Author: Vanithasri
 * Description: The classes in this file handle
 * various trading signals, applying corresponding actions.
 */

// Interface to define how to handle a signal.
interface SignalHandler {
    void handleSignal(int signal);
}

// Class that defines various actions related to trading algorithms.
class Algo {
    public void doAlgo() { System.out.println("doAlgo"); }
    public void cancelTrades() { System.out.println("cancelTrades"); }
    public void reverse() { System.out.println("reverse"); }
    public void submitToMarket() { System.out.println("submitToMarket"); }
    public void performCalc() { System.out.println("performCalc"); }
    public void setUp() { System.out.println("setUp"); }
    public void implementTrades() { System.out.println("**************implementTrades"); }
    public void forwardTrades() { System.out.println("--------forwardTrades"); }
    public void reverseTrades() { System.out.println("***********reverseTrades"); }
    public void ignoreTrades() { System.out.println("----------ignoreTrades"); }
    public void setAlgoParam(int param, int value) { System.out.println("setAlgoParam " + param + "," + value); }
}

// Main application class that implements SignalHandler,
// executing specific actions based on signals.
class Application implements SignalHandler {
    private final List<SignalAction> signals;

    public Application(List<SignalAction> signals) {
        this.signals = signals;
    }

    // Implementation of the handleSignal method from SignalHandler interface.
    @Override
    public void handleSignal(int signal) {
        SignalAction signalAction = signals.get(signal - 1);
        handleSignalAction(signalAction);
    }

    // Helper method to process the actions associated with a given signal.
    public void handleSignalAction(SignalAction signalAction) {
        Algo algo = new Algo();
        List<String> actions = signalAction.getActions();

        for (String action : actions) {
            Consumer<Algo> algoAction = AlgoActions.getAction(action);
            algoAction.accept(algo);
        }

        algo.doAlgo();
    }

    // Main method to run the application.
    public static void main(String[] args) {

        SignalLoader signalLoader = new SignalLoader();
        try {
            // Load signals from external source.
            List<SignalAction> signals = signalLoader.loadSignals();
            Application app = new Application(signals);

            // Process each signal and perform associated actions.
            for (SignalAction signalAction : signals) {
                int signal = signalAction.getSignal();
                app.handleSignal(signal); // Using the signal integer
                System.out.println("Processing signal: " + signal);
            }

            // Ask for additional signal input from the user.
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please Enter the signal value: ");
            int signalValue = scanner.nextInt(); // Read the signal value from the console

            // Handle the user-input signal if valid.
            if (signalValue > 0 && signalValue <= signals.size()) {
                app.handleSignal(signalValue); // Handle the signal
            } else {
                System.out.println("Invalid signal value!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
