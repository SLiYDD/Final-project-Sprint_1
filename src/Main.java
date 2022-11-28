import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        while (true){
            printMenu();
            int command = scanner.nextInt();
            if (command == 1){
                System.out.println("Введите месяц . день , кол-во шагов");
                int month = scanner.nextInt();
                int day = scanner.nextInt();
                int step = scanner.nextInt();
                stepTracker.saveToData(month,day,step);
            } else if (command == 2) {
                System.out.println("Введите месяц");
                int month = scanner.nextInt();
                stepTracker.printStat(month);
            } else if(command == 3){
                System.out.println("Цель " + stepTracker.normPerDay + " шагов в день.");
                System.out.println("Какое значение вы хотели бы задать?");
                int normPerDay = scanner.nextInt();
                stepTracker.setNormDay(normPerDay);
                System.out.println("Ваша цель " + stepTracker.normPerDay + " шагов в день.");
            } else if (command == 0) {
                break;
            }
        }
        System.out.println("ДО НОВЫХ ВСТРЕЧ!!!");
    }

    public static void printMenu(){
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
    }
}
