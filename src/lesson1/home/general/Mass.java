package lesson1.home.general;

import lesson1.home.menu.SearchMenu;
import lesson1.home.utils.UtilElements;
import lesson1.home.utils.UtilSearch;

import java.util.Scanner;


public class Mass {
    static private int[] mass;
    private  static Scanner in = new Scanner(System.in);

    public Mass() {
        while (true){
        System.out.println("Введите размер массива:");
        int razmer=in.nextInt();
        if ((razmer>0) &&(razmer<11))
        {
            mass=new int[razmer];
            return;
        }
        System.out.println("Введенный размер некоректен");
        }

    }
    static boolean searchElemnt(int element)
    {
        for (int i=0;i<mass.length;i++)
        {
            if (element==mass[i])
            {

                return true;
            }
        }
        return false;
    }

    static void fillMass()
    {   System.out.println("Ведите значения:");
        boolean havezero=false;
        for(int i=0;i < mass.length; i++){
            int element=in.nextInt();
            if ((element==0) &&(havezero==false))
            {
                mass[i]=element;
                havezero=true;
            } else
            if ((searchElemnt(element)) )
            {
                System.out.println("Такое значение уже существует в массиве");
                i--;
            } else
            {
                mass[i]=element;
            }

        }
    }
    public static int[] getMass() {
        return mass;
    }

}
