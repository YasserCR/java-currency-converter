package org.bedu.jse.basico.reto;

public class CurrencyConverterInitializer {
    public static CurrencyConverter createCurrencyConverter() {
        CurrencyConverter converter = new CurrencyConverter();

        final String USD = "USD";
        final String EUR = "EUR";
        final String TRY = "TRY";
        final String ARS = "ARS";
        final String MXN = "MXN";
        final String PEN = "PEN";
        final String CAD = "CAD";
        final String JPY = "JPY";
        final String KRW = "KRW";
        final String RUB = "RUB";

        converter.addCurrency(USD, 1.0);
        converter.addCurrency(EUR, 0.92);
        converter.addCurrency(TRY, 27.21);
        converter.addCurrency(ARS, 349.87);
        converter.addCurrency(MXN, 17);
        converter.addCurrency(PEN, 3.72);
        converter.addCurrency(CAD, 1.35);
        converter.addCurrency(JPY, 146.05);
        converter.addCurrency(KRW, 1338.96);
        converter.addCurrency(RUB, 93.50);


        return converter;
    }
}
