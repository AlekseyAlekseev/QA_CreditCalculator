package ru.netology;

public class CreditPaymentService {

    /**
     * Расчет ежемесячного платежа по кредиту
     * @param sum - Сумма кредита
     * @param months - Срок погашения в месяцах
     * @param rates - Ставка по кредиту
     * @return - Возвращает сумму ежемесячного платежа
     */
    public int getMonthlyPay(int sum, int months, double rates) {
        // расчет ежемесячного процента
        double rate = rates / 100 / 12;
        // расчет коэффициента аннуитета
        double coefficient = (rate * Math.pow((1  + rate), months) / ( Math.pow((1 + rate), months ) - 1));
        // расчет ежемесячного платежа
        return (int) Math.round(sum * coefficient);
    }
}
