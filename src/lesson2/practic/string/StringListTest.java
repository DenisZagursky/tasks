package lesson2.practic.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dzenyaa on 13.10.2017.
 */
public class StringListTest implements Testable {
    private String[] array={"Opel","Vw","Ferrari","Tesla","Toyta","Ferarri"};
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

    private void addValuesToList(String[] array) {
        for(int i=0;i<array.length;i++)
        {
            list.add(array[i]);
        }
    }
}
