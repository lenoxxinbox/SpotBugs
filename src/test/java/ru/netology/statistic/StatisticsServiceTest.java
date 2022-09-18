package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNegative() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-12, -5, -8, -4, -5, -3, -8, -6, -11, -11, -12};
        long expected = -3;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNegativeWithZero() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, -5, -8, -4, -5, -3, 0, -6, -11, 75, -12};
        long expected = 75;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNegativeWithLong() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 10_000, 285_000, 1_000_000, -5, -3, 0, -12};
        long expected = 1_000_000;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}