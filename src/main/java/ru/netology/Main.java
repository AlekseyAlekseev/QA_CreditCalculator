package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CreditPaymentService creditService = new CreditPaymentService();

        int result1 = creditService.getMonthlyPay(1_000_000, 12, 9.99);
        System.out.println("Ваш ежемесячный платеж составляет: " + result1);

        int result2 = creditService.getMonthlyPay(1_000_000, 24, 9.99);
        System.out.println("Ваш ежемесячный платеж составляет: " + result2);

        int result3 = creditService.getMonthlyPay(1_000_000, 36, 9.99);
        System.out.println("Ваш ежемесячный платеж составляет: " + result3);


        // TODO При необходимости раскоментировать для реализации ручного ввода данных по кредиту
        /**
         int sum;
         int months;
         int rates;
         int total;
         Scanner input = new Scanner(System.in);

         System.out.println("\nДля расчета ежемесячного платежа введите данные по порядку через запятую - " +
         "'Сумма кредита','Срок погашения в месяцах','Ставка по кредиту'");
         String resultGetMonthlyPay = input.nextLine();
         String[] parts = resultGetMonthlyPay.split(",");
         sum = Integer.parseInt(parts[0]);
         months = Integer.parseInt(parts[1]);
         rates = Integer.parseInt(parts[2]);
         total = creditService.getMonthlyPay(sum, months, rates);
         System.out.println("Ваш ежемесячный платеж составляет: " + total);

         input.close();
         */
    }
}
