public class Converter {
    double sizeStep = 0.75;
    int caloriesPerStep = 50;

    int stepToKM(int sumToMonth) {
        double distance = sumToMonth * sizeStep;
        return (int) (distance / 1000);
    }

    int stepToCalories(int sumToMonth) {
        int energy = sumToMonth * caloriesPerStep;
        return energy / 1000;
    }
}
