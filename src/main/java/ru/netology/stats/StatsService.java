
package ru.netology.stats;

public class StatsService {

    //Сумма продаж сумарно
    public int getSumSales(int[] sales) {
        int sumSales = 0;
        for (int saleMonth : sales) {
            sumSales += saleMonth;
        }
        return sumSales;
    }

    //Средняя сумма продаж в месяц
    public int getAvgSales(int[] sales) {
        int month = sales.length;
        int avgSales = getSumSales(sales) / month;
        return avgSales;
    }

    //Номер месяца, в котором был пик продаж
    public int getMaxMonth(int[] sales) {
        int maxSales = sales[0];
        int numberMonth = 0;
        int maxMonth = 0;
        for (int saleMonth : sales) {
            numberMonth += 1;
            if (saleMonth > maxSales) {
                maxSales = saleMonth;
                maxMonth = numberMonth;
            }
        }
        return maxMonth;
    }

    //Номер месяца, в котором был минимум продаж
    public int getMinMonth(int[] sales) {
        int minSales = sales[0];
        int numberMonth = 0;
        int minMonth = 0;
        for (int saleMonth : sales) {
            numberMonth += 1;
            if (saleMonth < minSales) {
                minSales = saleMonth;
                minMonth = numberMonth;
            }
        }
        return minMonth;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int getMonthLessAvg(int[] sales) {
        int monthLessAvg = 0;
        for (int sale : sales) {
            if (sale < getAvgSales(sales)) {
                monthLessAvg += 1;
            }
        }
        return monthLessAvg;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int getMonthOverAvg(int[] sales) {
        int monthOverAvg = 0;
        for (int sale : sales) {
            if (sale < getAvgSales(sales)) {
                monthOverAvg += 1;
            }
        }
        return monthOverAvg;
    }

}
