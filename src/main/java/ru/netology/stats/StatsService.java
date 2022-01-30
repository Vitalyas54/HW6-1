package ru.netology.stats;

public class StatsService {

    public int calcSalesSum(int[] sales) { // Вычисляем сумму всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findSalesAvg(int[] sales) { // Вычисляем среднюю сумму всех продаж

        return calcSalesSum(sales) / sales.length;
    }

    public int findMaxSales(int[] sales) { // Вычисляем максимальную продажу
        int currentMax = sales[0];
        for (int sale : sales) {
            if (sale > currentMax) {
                currentMax = sale;
            }
        }
        return currentMax;
    }

    public int findMinSales(int[] sales) { // Вычисляем минимальную продажу
        int currentMin = sales[0];
        for (int sale : sales) {
            if (sale < currentMin) {
                currentMin = sale;
            }
        }
        return currentMin;
    }

    public int calcMaxSalesMonth(int[] sales) { // Находим номер месяца с максимальной продажей
        int currentMaxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[currentMaxMonth]) {
                currentMaxMonth = month;
            }
            month = month + 1;
        }
        return currentMaxMonth + 1;
    }

    public int calcMinSalesMonth(int[] sales) { // Находим номер месяца с минимальной продажей
        int currentMinMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[currentMinMonth]) {
                currentMinMonth = month;
            }
            month = month + 1;
        }
        return currentMinMonth + 1;
    }

    public int numMonthsMaxSales(int[] sales) { // Считаем количество месяцев с продажами больше средней сумму всех продаж
        int monthCount = 0;
        int average = findSalesAvg(sales);
        for (int sale : sales) {
            if (sale > average) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }

    public int numMonthsMinSales(int[] sales) { // Считаем количество месяцев с продажами меньше средней сумму всех продаж
        int monthCount = 0;
        int average = findSalesAvg(sales);
        for (int sale : sales) {
            if (sale < average) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }
}
