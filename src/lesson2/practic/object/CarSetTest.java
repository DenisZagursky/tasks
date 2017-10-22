package lesson2.practic.object;

import lesson2.practic.string.Testable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CarSetTest implements Testable {
    private Car[] array = {new Car(1, "Opel", 2.45, 150),
            new Car(2, "Wv", 5.67, 145),
            new Car(3, "ferrari", 3.44, 180),
            new Car(1, "Opel", 2.45, 150),
            new Car(4, "Tesla", 2.44, 165),};
    private Set<Car> set = new HashSet();

    @Override
    public void test() {
        putValuesToSet(array);
        printSetEntries(set);

    }

    private void printSetEntries(Set<Car> set) {
        for (Car entry : set) {
            System.out.println("Entry:" + entry);
        }
        System.out.println("Array length:" + array.length);
        System.out.println("Array length:" + set.size());
    }

    private void putValuesToSet(Car[] array) {
        set.addAll(Arrays.asList(array));

    }
}
