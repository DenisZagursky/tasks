package lesson1.home.menu;

import lesson1.home.utils.Reader;

import java.util.Scanner;

/**
 * Created by Dzenyaa on 09.10.2017.
 */
public interface Menu {

    void printMenu();

    void run();

    Scanner in = Reader.getIn();
}
