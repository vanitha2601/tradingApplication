package com.db;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SignalLoader {

    public List<SignalAction> loadSignals() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("signals.json");
        ObjectMapper objectMapper = new ObjectMapper();
        List<SignalAction> signals = objectMapper.readValue(inputStream, new TypeReference<List<SignalAction>>() {});
        return signals;
    }
}
