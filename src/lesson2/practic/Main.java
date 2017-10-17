package lesson2.practic;

import lesson2.practic.object.CarListTest;
import lesson2.practic.object.CarMapTest;
import lesson2.practic.object.CarSetTest;
import lesson2.practic.string.Testable;

/**
 * Created by Dzenyaa on 13.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Testable testable=new CarMapTest();
        testable.test();
    }
}
