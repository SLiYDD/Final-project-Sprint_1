public class StepTracker {
    MonthData[] monthToData;
    int normPerDay;

    MonthData monthData = new MonthData();

    public StepTracker(){
        monthToData = new MonthData[4];
        normPerDay = 10000;
        for (int i = 0; i < monthToData.length; i++){
            monthToData[i] = new MonthData();
        }
    }
    int setNormDay(int normPerDay){ //setNormDay
        if (normPerDay >= 0){
            this.normPerDay = normPerDay;
            return normPerDay;
        }else {
            System.out.println("Ошибка!!! Введено отрицательное значение");
            return normPerDay;
        }
    }

    void printStat(int month){
        monthToData[month].getStepsToDay();
        System.out.println("Общее количество шагов за месяц : " + monthToData[month].getStepsToMonth());
        System.out.println("Максимальное пройденное количество шагов в месяце : " + monthToData[month].findMaxSteps());
        System.out.println("Пройденная дистанция (в км) : " + monthToData[month].findDistatnce());
    }
    void saveToData(int month, int day, int step){ //saveToData
        monthData.setToDay(day, step);
        monthToData[month] = monthData;
    }
}
class MonthData{
    int[] steps;

    Converter converter = new Converter();

    public MonthData(){
        steps = new int[30];
    }

    void setToDay(int day, int step){
        steps[day] = steps[day] + step;
    }

    void getStepsToDay(){
        for (int i = 0;i < steps.length;i++){
            System.out.println( (i + 1) + " День пройдено: " + steps[i]);
        }
    }
    int getStepsToMonth(){
        int sumToMonth = 0;
        for (int i = 0;i<steps.length;i++){
            sumToMonth += steps[i];
        }
        return sumToMonth;
    }

    int findMaxSteps(){
        int maxSteps = steps[0];
        for (int i = 1;i<steps.length;i++){
            if (maxSteps < steps[i]){
                maxSteps = steps[i];
            }
        }
        return maxSteps;
    }

    double findDistatnce(){
        double distance = converter.stepToKM(getStepsToMonth());
        return distance;
    }

}
