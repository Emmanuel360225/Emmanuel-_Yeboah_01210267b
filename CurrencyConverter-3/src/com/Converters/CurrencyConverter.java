package com.Converters;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static final Map<String, Double> exchangeRates = new HashMap<String, Double>();

    static {
        exchangeRates.put("USD_GHS", 12.5);  // 1 USD to GHS
        exchangeRates.put("GHS_USD", 1 / 12.5);
        exchangeRates.put("EUR_GHS", 13.2);  // 1 EURO to GHS
        exchangeRates.put("GHS_EUR", 1 / 13.2);
        exchangeRates.put("YEN_GHS", 0.08);  // 1 Yen to GHS
        exchangeRates.put("GHS_YEN", 1 / 0.08);
    }

    public static double convert(String from, String to, double amount) {
        String key = from + "_" + to;
        if (exchangeRates.containsKey(key)) {
            return amount * exchangeRates.get(key);
        } else {
            throw new IllegalArgumentException("Invalid conversion type: " + from + " to " + to);
        }
    }
}
