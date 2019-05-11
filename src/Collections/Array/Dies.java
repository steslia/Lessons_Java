package Collections.Array;

import java.security.SecureRandom;

public class Dies {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        int[] array = new int[7];

        //Получаем элемент масива через рандом индекса и увеличеваем его на 1
        //(рандомно получаем элемент массива через индекс и увеличеваем его на 1)
        for (int i =0; i<1000;i++){
            ++array[1+random.nextInt(6)];
        }

        for (int i = 1; i<array.length; i++) {
            System.out.println("Side "+i+" : " +array[i]);
        }
    }
}
