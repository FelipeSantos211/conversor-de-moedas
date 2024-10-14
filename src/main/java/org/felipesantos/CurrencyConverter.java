package org.felipesantos;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyService currencyService = new CurrencyService();
        ConversionUtil conversionUtil = new ConversionUtil();
        String[] currencies = {"USD", "EUR", "BRL", "JPY", "GBP", "AUD", "CAD"};
        boolean continueConversion = true;

        System.out.println("Conversor de Moedas");

        while (continueConversion) {
            // Seleção da moeda base
            System.out.println("\nEscolha a moeda base:");
            for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }
            System.out.print("Digite o número correspondente à moeda base: ");
            int baseChoice = scanner.nextInt();
            String baseCurrency = currencies[baseChoice - 1];

            // Valor a ser convertido
            System.out.print("Digite o valor a ser convertido: ");
            double amount = scanner.nextDouble();

            // Seleção da moeda alvo
            System.out.println("Escolha a moeda alvo:");
            for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }
            System.out.print("Digite o número correspondente à moeda alvo: ");
            int targetChoice = scanner.nextInt();
            String targetCurrency = currencies[targetChoice - 1];

            // Verificação e conversão
            if (baseCurrency.equals(targetCurrency)) {
                System.out.println("A moeda base e a moeda alvo são as mesmas. Escolha moedas diferentes.");
            } else {
                double rate = currencyService.getConversionRate(baseCurrency, targetCurrency);
                if (rate != -1) {
                    double convertedAmount = conversionUtil.convertCurrency(amount, rate);
                    System.out.printf("%.2f %s = %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);
                } else {
                    System.out.println("Falha na conversão.");
                }
            }

            // Perguntar se deseja continuar
            System.out.print("Deseja realizar outra conversão? (S/N): ");
            String response = scanner.next().trim().toUpperCase();
            if (!response.equals("S")) {
                continueConversion = false;
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
