public class StepTracker {
    MonthData[] monthToData;
    int normPerDay;

    MonthData monthData = new MonthData();

    public StepTracker() {
        monthToData = new MonthData[4];
        normPerDay = 10000;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    int setNormDay(int normPerDay) {
        if (normPerDay >= 0) {
            this.normPerDay = normPerDay;
            return normPerDay;
        } else {
            System.out.println("Ошибка!!! Введено отрицательное значение");
            return normPerDay;
        }
    }

    void printStat(int month) {
        System.out.println("+++++++++++++++++++++ДАННЫЕ+++++++++++++++++++++++++");
        monthToData[month].getStepsToDay();
        System.out.println("Общее количество шагов за месяц : " + monthToData[month].getStepsToMonth());
        System.out.println("Максимальное пройденное количество шагов в месяце : " + monthToData[month].findMax());
        System.out.println("Среднее количество шагов за этот месяц : " + monthToData[month].avgSteps());
        System.out.println("Пройденная дистанция (в км) : " + monthToData[month].findDistatnce());
        System.out.println("Количество сожжённых килокалорий : " + monthToData[month].findKcal());
        System.out.println("Лучшая серия : " + monthToData[month].bestSeries(normPerDay));
        System.out.println("----------------------------------------------------");
    }

    void saveToData(int month, int day, int step) { //saveToData
        monthData.setToDay(day, step);
        monthToData[month] = monthData;
    }


    void autofill() {
        for (int i = 0; i < monthToData.length; i++) {
            monthData.randomSteps();
            monthToData[i] = monthData;
        }
    }
}
