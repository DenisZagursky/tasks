package lesson2.practic.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Dzenyaa on 13.10.2017.
 */
public class StringMapTest implements Testable {
    private String[] array={"Opel","Vw","Ferrari","Tesla","Toyta","Ferarri"};
    private Map<String,Integer> map=new HashMap();
    @Override
    public void test() {
        putValuesToMap(array);
        printMapEntries(map);
    }

    private void printMapEntries(Map<String,Integer> map) {
       for (Map.Entry<String,Integer> entry: map.entrySet())
       {
           System.out.println("Item:"+entry.getKey()+",number:"+entry.getValue());
       }
        System.out.println("Array length:"+ array.length);
        System.out.println("Map length:"+ map.size());

    }

    private void putValuesToMap(String[] array) {
        for(String item:array)
        {
            map.put(item,new Random().nextInt(10)+1);
        }

    }
}
