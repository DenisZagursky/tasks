package lesson1.home.menu;

import lesson1.home.utils.Reader;

public class GeneralMenu implements Menu {
    @Override
      public void printMenu() {
        System.out.println("---");
        System.out.println("1. Операции");
        System.out.println("2. Печать");
        System.out.println("3. Выход");
        System.out.println("Выберите значение...");
    }

    @Override
    public void run() {
        TypeOperationMenu typeOperationMenu=new TypeOperationMenu();
        PrintMassMenu printMassMenu=new PrintMassMenu();
        while(true) {
            printMenu();
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    typeOperationMenu.run();
                    break;
                case 2:
                    printMassMenu.run();
                    break;
                case 3:
                    Reader.getIn().close();
                    return;
                default:
                    System.out.println("такого пункта не существует");
                    break;
            }
        }
    }
}
