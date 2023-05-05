package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalcExpenseTest {

    @Test
    public void CalcPar1() {
        CalcExpense service = new CalcExpense();
        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        // ожидаемый результат
        int expected = 3;

        // вызываем целевой метод
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalcPar2() {
        CalcExpense service = new CalcExpense();
        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        // ожидаемый результат
        int expected = 2;

        // вызываем целевой метод
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}