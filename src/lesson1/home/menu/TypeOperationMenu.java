package lesson1.home.menu;

/**
 * Created by Dzenyaa on 09.10.2017.
 */
public class TypeOperationMenu implements Menu {
    @Override
    public void printMenu() {
        System.out.println("---");
        System.out.println("1 Вычисления значений");
        System.out.println("2 Поиск");
        System.out.println("3 Назад");
        System.out.println("Выберите значение...");


    }

    @Override
    public void run() {
        NumberMenu numberMenu = new NumberMenu();
        SearchMenu searchMenu = new SearchMenu();
        while (true) {
            printMenu();
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    numberMenu.run();
                    break;
                case 2:
                    searchMenu.run();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("такого пункта не существует");
            }
        }
    }
}
