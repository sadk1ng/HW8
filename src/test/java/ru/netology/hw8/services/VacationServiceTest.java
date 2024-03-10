package ru.netology.hw8.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @Test
    public void testCalculateVacationMonths() {
        VacationService service = new VacationService();

        // Пример 1
        int income1 = 13_000, expenses1 = 3_000, threshold1 = 10_000;
        int result1 = service.calculateVacationMonths(income1, expenses1, threshold1);
        assertEquals(9, result1);

        // Пример 2
        int income2 = 111_111, expenses2 = 60_000, threshold2 = 100_000;
        int result2 = service.calculateVacationMonths(income2, expenses2, threshold2);
        assertEquals(7, result2);
    }
}
