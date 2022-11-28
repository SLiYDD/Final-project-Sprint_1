public class StepTracker {
    MonthData[] monthToData;
    int normPerDay;

    MonthData monthData =new MonthData();
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
        monthToData[month].getSteps();
    }
    void saveToData(int month, int day, int step){ //saveToData
        monthData.setToDay(day, step);
        monthToData[month] = monthData;
    }
}
class MonthData{
    int[] steps;

    public MonthData(){
        steps = new int[30];
    }

    void setToDay(int day, int step){
        steps[day] = steps[day] + step;
    }

    void getSteps(){
        for (int i = 0;i < steps.length;i++){
            System.out.println( (i + 1) + " День пройдено: " + steps[i]);
        }
    }

}
