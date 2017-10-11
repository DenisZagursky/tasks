package lesson1.home.menu;

import lesson1.home.utils.UtilSearch;

/**
 * Created by Dzenyaa on 09.10.2017.
 */
public class SearchMenu implements Menu {
    @Override
    public void printMenu() {
            System.out.println("---");
            System.out.println("1 Проверить входит ли число в массив");
            System.out.println("2 Заменить элемент массива на другой");
            System.out.println("3 Назад");
            System.out.println("Выберите значение...");
    }

    @Override
    public void run() {
        UtilSearch utilSearch=new UtilSearch();
        while (true) {
            printMenu();
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    utilSearch.searchElement();
                    break;
                case 2:
                    utilSearch.setNewElement();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("такого пункта не существует");
                    break;
            }
        }
    }
}
