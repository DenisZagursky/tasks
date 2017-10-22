package lesson1.home.utils;

/**
 * Created by Dzenyaa on 09.10.2017.
 */
public class UtilElements implements Utils {
    public void getMax() {
        int max = obj[0];
        for (int i = 0; i < obj.length; i++) {
            if (max < obj[i]) {
                max = obj[i];
            }

        }
        System.out.println("Максимальное значение в массиве:" + max);
    }

    public void getdMin() {
        int min = obj[0];
        for (int i = 0; i < obj.length; i++) {
            if (min > obj[i]) {
                min = obj[i];
            }

        }
        System.out.println("Максимальное значение в массиве:" + min);
    }

    public void getLength() {
        System.out.println("Длинна массива:" + (obj.length));
    }

    public void getFullSumm() {
        int summ = 0;
        for (int i = 0; i < obj.length; i++) {
            summ += obj[i];
        }
        System.out.println("Сумма значений массива равна:" + summ);
    }

    public void getAverage() {
        int summ = 0;
        for (int i = 0; i < obj.length; i++) {
            summ += obj[i];
        }
        System.out.println("среднее значение массива равно:" + (double) (summ / obj.length));
    }

}
