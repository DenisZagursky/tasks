package lesson2.practic.object;

import lesson2.practic.string.Testable;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dzenyaa on 13.10.2017.
 */
public class CarListTest implements Testable{
    private Car[] array={new Car(1,"Opel", 2.45, 150),
            new Car(2,"Wv",5.67,145),
            new Car(3,"ferrari",3.44,180),
            new Car(1,"Opel",2.45,150),
            new Car(4,"Tesla",2.44,165),};
    private List list=new LinkedList();
    @Override
    public void test() {
        addValuesToList(array);
        printListEntries();
    }

    private void printListEntries() {
        for (int i=0;i<list.size();i++)
        {System.out.println("Entry #"+i+":"+list.get(i));}
        System.out.println("Array length:"+ array.length);
        System.out.println("Array length:"+list.size());

    }

    private void addValuesToList(Car[] array) {
        for(int i=0;i<array.length;i++)
        {
            list.add(array[i]);
        }
    }

}
