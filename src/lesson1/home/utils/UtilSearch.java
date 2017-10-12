package lesson1.home.utils;

import java.util.Scanner;

/**
 * Created by Dzenyaa on 09.10.2017.
 */
public class UtilSearch implements Utils {

        private  Boolean haveElement(int element)
        {
            for (int i=0;i<obj.length;i++)
            {
                if (element==obj[i])
                {
                    return true;
                }
            }
            return false;
        }
        public void searchElement()
        {
            System.out.println("Введите число для поиска");
            int element=Reader.getIn().nextInt();
            if(haveElement(element)) {
                System.out.println("Элемент найден.");
                return;
            }
            System.out.println("Данный элемент не найден");
        }
        public void setNewElement()
        {

            System.out.println("Введите номер элемента, который хотите изменить:");
            int position=Reader.getIn().nextInt();
            if ((position>obj.length)||(position<1) )
            {
                System.out.println("Выход за пределы массива");
                return;
            }
            System.out.println("Введите новое значение:");
            int value=Reader.getIn().nextInt();
            if(haveElement(value))
            {
                System.out.println("Данное значение уже присутствует в массиве");
                return;
            } else
            {obj[position-1]=value;}
        }
}
