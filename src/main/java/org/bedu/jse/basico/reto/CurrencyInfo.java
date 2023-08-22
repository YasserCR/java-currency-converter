package org.bedu.jse.basico.reto;

public class CurrencyInfo {
    private String code;
    private double exchangeRate;

    public CurrencyInfo(String code, double exchangeRate) {
        this.code = code;
        this.exchangeRate = exchangeRate;
    }

    public String getCode() {
        return code;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
