package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long allSales = 0;

        for (long sale : sales) {
            allSales += sale;
        }
        return allSales;
    }


    public long averageSales(long[] sales) {

        return totalSales(sales) / sales.length;
    }


    public long maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int monthsBelowAverageSales(long[] sales) {
        int monthsBelow = 0;

        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                monthsBelow++;
            }
        }
        return monthsBelow;
    }


    public int monthsMoreAverageSales(long[] sales) {
        int monthsMore = 0;

        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                monthsMore++;
            }
        }
        return monthsMore;
    }
}

