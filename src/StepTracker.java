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
    int changenormPerDay(int normPerDay){
        if (normPerDay >= 0){
            this.normPerDay = normPerDay;
            return normPerDay;
        }else {
            System.out.println("Ошибка!!! Введено отрицательное значение");
            return normPerDay;
        }
    }
    MonthData[] setMonthToData(int month, int day, int step){
        monthData.setToDay(day, step);
        monthToData[month] = monthData;

        return monthToData;
    }
}
class MonthData{
    int[] steps;

    public MonthData(){
        steps = new int[30];
    }

    int[] setToDay(int day, int step){
        steps[day] = steps[day] + step;
        return steps;
    }
    
}
