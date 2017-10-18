package lesson2.practic.object;

import lesson2.practic.string.Testable;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dzenyaa on 13.10.2017.
 */
public class CarListTest implements Testable{
    private Car[] array={new Car(1,"Opel", 2.45, 150),
            new Car(2,"Wv",5.67,145),
            new Car(3,"ferrari",3.44,180),
            new Car(1,"Opel",2.45,150),
            new Car(4,"Tesla",2.44,165),};
    private List<Car> list=new ArrayList<>();
    @Override
    public void test() {
        addValuesToList(array);
        printListEntries();
        getSecondElement(list);
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
    private void deleteMaximumSpeed(List<Car>  list)
    {        int maximumSpeed=0;
        int keyMaximumSpeed=0;
        boolean firstElement=true;
        for (int i=0;i<list.size();i++) {
            if (firstElement) {
                maximumSpeed=list.get(i).getSpeed();
                keyMaximumSpeed=i;

            } else if (maximumSpeed < list.get(i).getSpeed()) {
                maximumSpeed = list.get(i).getSpeed();
                keyMaximumSpeed=i;
            }

        }
        list.remove(keyMaximumSpeed);
    }
    private void deleteMinimumSpeed(List<Car>  list)
    {        int minimumSpeed=0;
        int keyminimumSpeed=0;
        boolean firstElement=true;
        for (int i=0;i<list.size();i++) {
            if (firstElement) {
                minimumSpeed=list.get(i).getSpeed();
                keyminimumSpeed=i;

            } else if (minimumSpeed> list.get(i).getSpeed()) {
                minimumSpeed = list.get(i).getSpeed();
                keyminimumSpeed=i;
            }

        }
        list.remove(keyminimumSpeed);
    }
    private void totalWeightOfCars(List<Car> list)
    {
        Double totalWeight=0.0;
        for (int i=0;i<list.size();i++) {
            totalWeight+=list.get(i).getWeight();
        }
        System.out.println("Total Weight:"+String.format("%.2f",totalWeight));
    }
    private void deleteAllElmentsIf(char test,int x,List<Car> list)
    {
        switch (test) {
            case '>':{
                List<Car> listTest=new ArrayList<>(list);
                for (int i=0;i<listTest.size();i++) {
                    if (listTest.get(i).getSpeed()>x)
                    {
                        list.remove(listTest.get(i));
                    }
                } break;}

            case '<':{
                List<Car> listTest=new ArrayList<>(list);
                for (int i=0;i<listTest.size();i++) {
                    if (listTest.get(i).getSpeed()<x)
                    {
                        list.remove(listTest.get(i));
                    }
                } break;}
            default: System.out.println("Error. Invalid argument");
        }
    }
    private void findElementFromMap(char element, List<Car> list)
    {
        for (int i=0;i<list.size();i++) {
            String fullObj=list.get(i).getName()+
                           list.get(i).getSpeed()+
                           list.get(i).getWeight()+
                           list.get(i).getId();
            if (fullObj.indexOf(element)<0)
            {
                System.out.println("Map dont have element:"+element);
                return;
            }
        }
        System.out.println("Map have element:"+element);
    }
    private void getThirdElement(List<Car> list)
    {
        sortList(list);
        for (int i=0;i<list.size();i++) {
            if( i==2)
            {
                System.out.println( "3 element:"+list.get(i).toString());
                return;
            } else
            {
                i++;
            }
        }
        System.out.println("3 element dont exist");

    }
    private void getSecondElement(List<Car> list)
    {
        sortList(list);
        for (int i=0;i<list.size();i++) {
            switch (i) {
                case 1:
                    System.out.println("2 element:" + list.get(i).toString());
                    break;
                case 2:System.out.println("3 element:"+list.get(i).toString());
                    return;
            }
        }
        System.out.println("2 element dont exist");
    }
    private void addNumberForName(List<Car> list)
    {
        for(int i=0;i<list.size();i++)
        {
            list.get(i).setName(list.get(i).getName()+"_"+(i+1));

        }

    }
    private void chekPattern(List<Car> list)
    {
        Pattern pattern=Pattern.compile("^.+_\\d$");
        Matcher matcher;
        for(int i=0;i<list.size();i++)
        {
            matcher=pattern.matcher(list.get(i).getName());
            if (matcher.matches()==false)
            {
                System.out.println("does not match the pattern");
                return;
            }
        }
        System.out.println("meets the pattern");

    }
    private void sortList(List<Car> list)
    {
        Collections.sort(list, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {

                int key=o1.getSpeed().compareTo(o2.getSpeed());
                if (key==0)
                {
                    return o1.getWeight().compareTo(o2.getWeight());
                }
                else
                {
                    return key;
                }
            }
        });
    }







}
