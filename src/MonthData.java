class MonthData {
    int[] steps;

    Converter converter = new Converter();

    public MonthData() {
        steps = new int[30];
    }


    void setToDay(int day, int step) {
        steps[day] = steps[day] + step;
    }

    void getStepsToDay() {
        for (int i = 0; i < steps.length; i++) {
            System.out.println((i + 1) + " День пройдено: " + steps[i]);
        }
    }

    int getStepsToMonth() {
        int sumToMonth = 0;
        for (int i = 0; i < steps.length; i++) {
            sumToMonth += steps[i];
        }
        return sumToMonth;
    }

    int findMax() {
        int maxValue = steps[0];
        for (int i = 1; i < steps.length; i++) {
            if (maxValue < steps[i]) {
                maxValue = steps[i];
            }
        }
        return maxValue;
    }

    int avgSteps() {
        int avgValue = getStepsToMonth() / 30;
        return avgValue;
    }

    int findDistatnce() {
        return converter.stepToKM(getStepsToMonth());
    }

    int findKcal() {
        return converter.stepToCalories(getStepsToMonth());
    }

    void randomSteps() {
        for (int i = 0; i < steps.length; i++) {
            double x = Math.random() * 20000;
            steps[i] = (int) x;
        }
    }

    int bestSeries(int normPerDay) {
        int series = 0;
        int maxSeries = 0;
        for (int i = 0; i < steps.length; i++) {
            if (steps[i] >= normPerDay) {
                series++;
                if (series > maxSeries) {
                    maxSeries = series;
                }
            } else {
                series = 0;
            }
        }
        return maxSeries;
    }
}


