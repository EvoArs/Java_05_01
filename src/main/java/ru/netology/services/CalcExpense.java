package ru.netology.services;
//income - доход = 10_000
//expenses - расход = 3_000
//threshold - остаток = 20_000

public class CalcExpense {
    public int calculate(int income, int expenses, int threshold) {
        int monthCalc = 0;  // счётчик месяцев
        int balance = 0;    // начальное количество денег
        // счетчик (первый месяц = 1; условие не более 12 мес.; перечесление)
        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                balance = (balance - expenses) / 3;
                monthCalc++;
            } else {
                balance = (balance + income - expenses);
            }
        }
        return monthCalc;
    }
}