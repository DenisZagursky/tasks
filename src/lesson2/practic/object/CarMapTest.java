package lesson2.practic.object;

import lesson2.practic.string.Testable;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dzenyaa on 13.10.2017.
 */
public class CarMapTest implements Testable {
    private Car[] array={new Car(1,"Opel", 2.45, 150),
            new Car(2,"Wv",5.67,150),
            new Car(3,"Ferrari",3.44,180),
            new Car(1,"Opel",2.45,150),
            new Car(4,"Tesla",2.44,165),};

    private Map<String,Car> map=new TreeMap<>();
    @Override
    public void test() {
        putValuesToMap(array);
        chekPattern(map);
        addNumberForName(map);
        chekPattern(map);
        printMapEntries(map);



    }

    private void printMapEntries(Map<String,Car> map) {
        for (Map.Entry<String,Car> entry: map.entrySet())
        {
            System.out.println("value:"+entry.getKey()+",  object:"+entry.getValue());
        }
        System.out.println("Array length:"+ array.length);
        System.out.println("Map length:"+ map.size());

    }

    private void putValuesToMap(Car[] array) {
        for(Car item:array)
        {
            map.put(item.getName(),item);


        }

    }
    private void deleteMaximumSpeed(Map <String,Car> map)
    {        int maximumSpeed=0;
         String keyMaximumSpeed="";
        boolean firstElement=true;
        for (Map.Entry<String,Car> entry: map.entrySet()) {
            if (firstElement) {
                maximumSpeed = entry.getValue().getSpeed();
                keyMaximumSpeed = entry.getKey();

            } else if (maximumSpeed < entry.getValue().getSpeed()) {
                maximumSpeed = entry.getValue().getSpeed();
                keyMaximumSpeed=entry.getKey();
            }

        }
        map.remove(keyMaximumSpeed);
    }
    private void deleteMinimumSpeed(Map <String,Car> map)
    {        int minimumSpeed=0;
        String keyMinimumSpeed="";
        boolean firstElement=true;
        for (Map.Entry<String,Car> entry: map.entrySet()) {
            if (firstElement) {
                minimumSpeed = entry.getValue().getSpeed();
                keyMinimumSpeed = entry.getKey();

            } else if (minimumSpeed > entry.getValue().getSpeed()) {
                minimumSpeed = entry.getValue().getSpeed();
                keyMinimumSpeed=entry.getKey();
            }

        }
        map.remove(keyMinimumSpeed);
    }
    private void totalWeightOfCars(Map<String,Car> map)
    {
        Double totalWeight=0.0;
        for (Map.Entry<String,Car> entry: map.entrySet()) {
            totalWeight+=entry.getValue().getWeight();
        }
        System.out.println("Total Weight:"+String.format("%.2f",totalWeight));
    }
    private void deleteAllElmentsIf(char test,int x,Map<String,Car> map)
    {
        switch (test) {
            case '>':{
                Map<String,Car> mapTest=new HashMap<>(map);
                for (Map.Entry<String,Car> entry: mapTest.entrySet()) {
                    if (entry.getValue().getSpeed()>x)
                    {
                        map.remove(entry.getKey());
                    }
                } break;}

            case '<':{
                Map<String,Car> mapTest=new HashMap<>(map);
                for (Map.Entry<String,Car> entry: mapTest.entrySet()) {
                    if (entry.getValue().getSpeed()<x)
                    {
                        map.remove(entry.getKey());
                    }
                } break;}
            default: System.out.println("Error. Invalid argument");
        }
    }
    private void findElementFromMap(char element, Map<String,Car> map)
    {
        for (Map.Entry<String,Car> entry: map.entrySet()) {
        String fullObj=entry.getValue().getName()+
                       entry.getValue().getSpeed()+
                       entry.getValue().getWeight()+
                       entry.getValue().getId();
            if (fullObj.indexOf(element)<0)
            {
                System.out.println("Map dont have element:"+element);
                return;
            }
        }
        System.out.println("Map have element:"+element);
    }
    private void getThirdElement(Map<String,Car> map)
    {       int i=1;
        for (Map.Entry<String,Car> entry: map.entrySet()) {
            if( i==3)
            {
                System.out.println( "3 element:"+entry.toString());
                return;
            } else
            {
                i++;
            }
        }
        System.out.println("3 element dont exist");

    }
    private void getSecondElement(Map<String,Car> map)
    {
        int i=1;
        for (Map.Entry<String,Car> entry: map.entrySet()) {
            switch (i) {
                case 2:
                    System.out.println("2 element:" + entry.toString());
                    i++;
                    break;
                case 3:System.out.println("3 element"+entry.toString());
                    i++;
                    return;
                default: i++;
            }
        }
        System.out.println("2 element dont exist");
    }
    private void doubleFilter(Map<String,Car> map)
    {


    }
    private void addNumberForName(Map<String,Car> map)
    {   int i=1;
        for(Map.Entry<String ,Car> entry:map.entrySet())
        {
          entry.getValue().setName(entry.getValue().getName()+"_"+i);

        i++;
        }

    }
    private void chekPattern(Map<String,Car> map)
    {
        Pattern pattern=Pattern.compile("^.+_\\d$");
        Matcher matcher;
        for(Map.Entry<String ,Car> entry:map.entrySet())
        {
            matcher=pattern.matcher(entry.getValue().getName());
            if (matcher.matches()==false)
            {
                System.out.println("does not match the pattern");
                return;
            }
        }
        System.out.println("meets the pattern");

    }

}
