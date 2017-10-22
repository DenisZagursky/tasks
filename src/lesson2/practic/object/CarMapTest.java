package lesson2.practic.object;

import lesson2.practic.object.utils.map.UtilsCarMap;
import lesson2.practic.string.Testable;

import java.util.Map;
import java.util.TreeMap;


public class CarMapTest implements Testable {
    private Car[] array = {new Car(1, "Opel", 5.67, 150),
            new Car(2, "Wv", 2.45, 150),
            new Car(3, "Ferrari", 3.44, 180),
            new Car(1, "Opel", 5.67, 150),
            new Car(4, "Tesla", 2.44, 165),};

    private Map<String, Car> map = new TreeMap<>();

    @Override
    public void test() {
        putValuesToMap(array);
        printMapEntries(map);
        UtilsCarMap utilsCarMap = new UtilsCarMap();
        utilsCarMap.addNumberForName(map);
        utilsCarMap.doubleFilter(map);

    }

    private void printMapEntries(Map<String, Car> map) {
        for (Map.Entry<String, Car> entry : map.entrySet()) {
            System.out.println("value:" + entry.getKey() + ",  object:" + entry.getValue());
        }
        System.out.println("Array length:" + array.length);
        System.out.println("Map length:" + map.size());

    }

    private void putValuesToMap(Car[] array) {
        for (Car item : array) {
            map.put(item.getName(), item);
        }

    }

}
