package com.db;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class AlgoActions {

    private static final Map<String, Consumer<Algo>> actionsMap = new HashMap<>();

    static {
        actionsMap.put("setUp", Algo::setUp);
        actionsMap.put("cancelTrades", Algo::cancelTrades);
        actionsMap.put("reverse", Algo::reverse);
        actionsMap.put("submitToMarket", Algo::submitToMarket);
        actionsMap.put("performCalc", Algo::performCalc);
        actionsMap.put("setAlgoParam", algo -> algo.setAlgoParam(1, 200));
        // Add other mappings as needed
    }

    public static Consumer<Algo> getAction(String signal) {
        return actionsMap.get(signal);
    }
}
