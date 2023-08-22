package org.bedu.jse.basico.reto;

public interface Converter {
    double convert(double amount, CurrencyInfo fromCurrency, CurrencyInfo toCurrency);
}
