package org.example;

interface SignalHandler {
    void handleSignal(int signal);
}

class Algo {
    public void doAlgo() { System.out.println("doAlgo"); }
    public void cancelTrades() { System.out.println("cancelTrades"); }
    public void reverse() { System.out.println("reverse"); }
    public void submitToMarket() { System.out.println("submitToMarket"); }
    public void performCalc() { System.out.println("performCalc"); }
    public void setUp() { System.out.println("setUp"); }
    public void setAlgoParam(int param, int value) { System.out.println("setAlgoParam " + param + "," + value); }
}

class Application implements SignalHandler {
    public void handleSignal(int signal) {
        Algo algo = new Algo();

        switch (signal) {
            case 1:
                algo.setUp();
                algo.setAlgoParam(1,60);
                algo.performCalc();
                algo.submitToMarket();
                break;

            case 2:
                algo.reverse();
                algo.setAlgoParam(1,80);
                algo.submitToMarket();
                break;

            case 3:
                algo.setAlgoParam(1,90);
                algo.setAlgoParam(2,15);
                algo.performCalc();
                algo.submitToMarket();
                break;

            default:
                algo.cancelTrades();
                break;
        }

        algo.doAlgo();
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.handleSignal(1); // Testing with signal 1
    }
}
