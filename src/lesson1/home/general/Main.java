package lesson1.home.general;


import lesson1.home.menu.GeneralMenu;

public class Main {
    public static void main(String[] args) {
        new Mass();
        Mass.fillMass();
        GeneralMenu generalMenu=new GeneralMenu();
            generalMenu.run();

    }
}
