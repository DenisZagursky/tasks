package lesson1.home.utils;

import java.util.Scanner;

/**
 * Created by Dzenyaa on 09.10.2017.
 */
public class UtilSearch implements Utils {
    private Scanner in = new Scanner(System.in);
        public void searchElement()
        {
            System.out.println("Введите число для поиска");
            int element=in.nextInt();
            for (int i=0;i<obj.length;i++)
            {
                if (element==obj[i])
                {
                    System.out.print("Элемент найден. Его порядковый номер:");
                    System.out.println(++i);
                    return;
                }
            }
            System.out.println("Данный элемент не найден");
        }
        public void setNewElement()
        {

            System.out.println("Введите номер элемента, который хотите изменить:");
            int position=in.nextInt();
            if ((position>obj.length)||(position<1))
            {
                System.out.println("Выход за пределы массива");
                return;
            }
            System.out.println("Введите новое значение:");
            int value=in.nextInt();
            obj[position-1]=value;
        }
}
