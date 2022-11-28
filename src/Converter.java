public class Converter {
    double sizeStep = 0.75;
    int caloriesPerStep = 50;
    public double stepToKM(int sumToMonth){
        double distance = sumToMonth * sizeStep;
        return distance/1000;
    }

    public void stepToCalories(){

    }
}
