import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        while (true) {
            System.out.println("++++++++++++++++++++++|MENU|++++++++++++++++++++++++");
            printMenu();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Ввод : ");
            int command = scanner.nextInt();
            if (command == 1) {
                boolean flag = true;
                while (flag) {
                    System.out.print("Введите месяц ( от 1 до 12 ) - ");
                    int month = scanner.nextInt();
                    System.out.print("Введите день ( от 1 до 30 ) - ");
                    int day = scanner.nextInt();
                    System.out.print("Введите кол-во шагов - ");
                    int step = scanner.nextInt();
                    if (month < 0 || month > 11 || day < 0 || day > 30 || step < 0) {
                        System.out.println("Введены некоректные данные! Повторите попытку снова");
                    } else {
                        stepTracker.saveToData(month, day, step);
                        System.out.println();
                        flag = false;
                    }
                }
                System.out.println();

            } else if (command == 2) {
                boolean flag = true;
                while (flag) {
                    System.out.print("Введите месяц ( от 1 до 12 ) - ");
                    int month = scanner.nextInt();
                    if (month < 0 || month > 11) {
                        System.out.println("Введите существующий месяц!");
                    } else {
                        stepTracker.printStat(month);
                        System.out.println();
                        flag = false;
                    }
                }
            } else if (command == 3) {
                System.out.println("Цель " + stepTracker.normPerDay + " шагов в день.");
                System.out.println("Какое значение вы хотели бы задать?");
                int normPerDay = scanner.nextInt();
                stepTracker.setNormDay(normPerDay);
                System.out.println("Ваша цель " + stepTracker.normPerDay + " шагов в день.");
                System.out.println();
            } else if (command == 0) {
                break;
            } else if (command == 2022) {
                stepTracker.autofill();
            }else {
                System.out.println("Введите существующую команду");
                System.out.println();
            }
        }
        System.out.println("ДО НОВЫХ ВСТРЕЧ!!!");
    }

    public static void printMenu() {
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
        System.out.println("----------------------------------------------------");
        System.out.println("Введите код для автозаполения "); //КОД : 2022

    }
}
