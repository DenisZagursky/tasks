package lesson1.home.menu;

import lesson1.home.utils.UtilElements;

/**
 * Created by Dzenyaa on 09.10.2017.
 */
public class NumberMenu implements Menu{
    @Override
    public void printMenu() {
        System.out.println("---");
        System.out.println("1 Найти максимум");
        System.out.println("2 Найти минимум");
        System.out.println("3 Найти колличество");
        System.out.println("4 Найти сумму значений");
        System.out.println("5 Найти среднее");
        System.out.println("6 Назад");
        System.out.println("Выберите значение...");

    }

    @Override
    public void run() {
        UtilElements utilElements=new UtilElements();
        while(true) {
        printMenu();
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                utilElements.getMax();
                break;
            case 2:
                utilElements.getdMin();
                break;
            case 3:
                utilElements.getLength();
                break;
            case 4:
                utilElements.getFullSumm();
                break;
            case 5:
                utilElements.getAverage();
                break;
            case 6:
                return;
            default:
                System.out.println("такого пункта не существует");
                break;
        }
    }
    }
}
