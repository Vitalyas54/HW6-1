package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSalesSum() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcSalesSum(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindSalesAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findSalesAvg(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 20;
        int actual = service.findMaxSales(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSales() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = service.findMinSales(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calcMaxSalesMonth(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMinSalesMonth() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calcMinSalesMonth(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcNumbMaxSalesMonths() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numMonthsMaxSales(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcNumbMinSalesMonths() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numMonthsMinSales(managerSales);
        assertEquals(expected, actual);
    }
}