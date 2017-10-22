package lesson2.practic.object.utils.comparators;

import lesson2.practic.object.Car;

import java.util.Comparator;

/**
 * Created by Dzenyaa on 23.10.2017.
 */
public class ComparatorForList implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {

        int key = o1.getSpeed().compareTo(o2.getSpeed());
        if (key == 0) {
            return o1.getWeight().compareTo(o2.getWeight());
        } else {
            return key;
        }
    }
}
