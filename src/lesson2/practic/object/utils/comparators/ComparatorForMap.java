package lesson2.practic.object.utils.comparators;

import lesson2.practic.object.Car;

import java.util.Comparator;
import java.util.Map;


public class ComparatorForMap implements Comparator<Map.Entry<String, Car>> {


    @Override
    public int compare(Map.Entry<String, Car> o1, Map.Entry<String, Car> o2) {
        int key = o1.getValue().getSpeed().compareTo(o2.getValue().getSpeed());
        if (key == 0) {
            return o1.getValue().getWeight().compareTo(o2.getValue().getWeight());
        } else {
            return key;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

