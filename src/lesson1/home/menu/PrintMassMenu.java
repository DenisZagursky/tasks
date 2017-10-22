package lesson1.home.menu;

import lesson1.home.utils.UtilPrint;

/**
 * Created by Dzenyaa on 09.10.2017.
 */
public class PrintMassMenu implements Menu {
    @Override
    public void printMenu() {
        System.out.println("---");
        System.out.println("1 Печать массива в прямом порядке");
        System.out.println("2 Печать массива в обратном порядке");
        System.out.println("3 Печать массива в отсортированном порядке");
        System.out.println("4 Назад");
        System.out.println("Выберите значение...");


    }

    @Override
    public void run() {
        while (true) {
            printMenu();
            int choice = in.nextInt();
            UtilPrint utilPrint = new UtilPrint();
            switch (choice) {
                case 1:
                    utilPrint.printNormal();
                    break;
                case 2:
                    utilPrint.printReverse();
                    break;
                case 3:
                    utilPrint.printAssorted();
                    break;
                case 4:
                    return;
                case 5:
                    System.out.println("Выберите значение...");
                default:
                    System.out.println("такого пункта не существует");
                    break;
            }
        }
    }
}
