package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void sumSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.getSumSales(sales);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avgSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.getAvgSales(sales);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonthSaleTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.getMinMonth(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthSaleTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.getMaxMonth(sales);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthsLessAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.getMonthLessAvg(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthsOverAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.getMonthOverAvg(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}
