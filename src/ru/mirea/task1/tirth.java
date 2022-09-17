package ru.mirea.task1;
import java.util.Random;

public class tirth {
    public static void main(String []args) {
        int[] array;
        int s = 0;
        array = new int[10];
        for (int i = 0; i <= 9; i++){
            s = (int)Math.floor(Math.random()*(100)+50);
//            System.out.println(s);
            array[i] = s;
        }
        int tempr;
        for (int i2 = 0; i2 <= 9; i2++){
            for (int i3 = 0; i3 <= 9; i3++){
                if(array[i2] < array[i3]){
                  tempr = array[i3];
                  array[i3] = array[i2];
                  array[i2] = tempr;
                }
            }
        }
        for (int i = 0; i <= 9; i++){
            System.out.println(array[i] + " ");
        }
    }
}
