package lesson1.home.utils;

import lesson1.home.general.Mass;

public class UtilPrint implements Utils {


    private void print(int[] obj)
    {   System.out.print("{");
        for (int i=0;i<obj.length;i++)
        {
            System.out.print(obj[i]+"  ");
        }
        System.out.println("}");
    }
    public void printNormal()
    {
     print(obj);
    }
     public void printReverse()
    {
        for (int i = 0; i < obj.length / 2; i++) {
            int tmp = obj[i];
            obj[i] = obj[obj.length - i - 1];
            obj[obj.length - i - 1] = tmp;
        }
        print(obj);
    }
     public void printAssorted()
    {
        int tmp;
        for (int i = 0; i < obj.length; i++)
        {
            for (int j = i + 1; j < obj.length; j++) {
                if (obj[j] < obj[i]) {
                    tmp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = tmp;
                }
            }
        }
        print(obj);
    }
}
