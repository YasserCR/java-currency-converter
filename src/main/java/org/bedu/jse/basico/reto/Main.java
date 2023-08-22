package org.bedu.jse.basico.reto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = CurrencyConverterInitializer.createCurrencyConverter();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Available currencies:");
            for (String currencyCode : converter.getAvailableCurrencies()) {
                System.out.println(currencyCode);
            }

            System.out.print("Enter the source currency: ");
            String sourceCurrencyCode = scanner.nextLine().toUpperCase();
            CurrencyInfo sourceCurrencyInfo = converter.getCurrencyInfo(sourceCurrencyCode);

            if (sourceCurrencyInfo == null) {
                System.out.println("Invalid currency.");
                continue;
            }

            System.out.print("Enter the target currency: ");
            String targetCurrencyCode = scanner.nextLine().toUpperCase();
            CurrencyInfo targetCurrencyInfo = converter.getCurrencyInfo(targetCurrencyCode);

            if (targetCurrencyInfo == null) {
                System.out.println("Invalid currency.");
                continue;
            }

            System.out.print("Enter the amount to convert: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            double result = converter.convert(amount, sourceCurrencyInfo, targetCurrencyInfo);

            System.out.printf("%.2f %s are %.2f %s%n", amount, sourceCurrencyCode, result, targetCurrencyCode);

            System.out.print("Do you want to perform another conversion? (y/n): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Thank you, come back soon.");
        scanner.close();
    }
}