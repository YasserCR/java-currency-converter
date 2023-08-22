package org.bedu.jse.basico.reto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyConverter implements Converter {
    private Map<String, CurrencyInfo> currencies = new HashMap<>();

    public void addCurrency(String code, double exchangeRate) {
        currencies.put(code, new CurrencyInfo(code, exchangeRate));
    }

    public List<String> getAvailableCurrencies() {
        return new ArrayList<>(currencies.keySet());
    }

    public CurrencyInfo getCurrencyInfo(String currencyCode) {
        return currencies.get(currencyCode);
    }

    @Override
    public double convert(double amount, CurrencyInfo fromCurrency, CurrencyInfo toCurrency) {
        double sourceToUSD = amount / fromCurrency.getExchangeRate();
        return sourceToUSD * toCurrency.getExchangeRate();
    }
}