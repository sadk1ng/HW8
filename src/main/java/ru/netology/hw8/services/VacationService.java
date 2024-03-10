package ru.netology.hw8.services;

public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month <= 12; month++) {
            if (money <= threshold) {
                money += income;
                money -= expenses;

                if (money >= threshold) {
                    count++;
                    money -= expenses;
                    money -= income * 3;
                }
            } else {
                count++;
                money -= expenses;
                money -= income * 3;
            }

        }
        return count;
    }
}