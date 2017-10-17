package lesson2.practic.string;

import lesson1.home.menu.SearchMenu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dzenyaa on 13.10.2017.
 */
public class StringSetTest implements Testable {
    private String[] array={"Opel","Vw","Ferrari","Tesla","Toyta","Ferrari"};
    private Set<String> set=new HashSet();
    @Override
    public void test() {
        putValuesToSet(array);
        printSetEntries(set);

    }

    private void printSetEntries(Set<String> set) {
        for (String entry:set)
        {System.out.println("Entry:"+ entry);}
        System.out.println("Array length:"+ array.length);
        System.out.println("Array length:"+set.size());
    }

    private void putValuesToSet(String[] array) {
        set.addAll(Arrays.asList(array));

    }
}
