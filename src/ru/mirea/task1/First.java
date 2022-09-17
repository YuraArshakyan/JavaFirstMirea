package ru.mirea.task1;
import java.util.Scanner;
public class First {
    public static void main(String []args) {
        System.out.println("Enter the length of array");
        Scanner scan_of_num = new Scanner(System.in);
        int s  = scan_of_num.nextInt();
        int[] array;
        array = new int[s];
        int summ_FOR = 0;
        int summ_While = 0;
        int summ_DO_While = 0;
        int i1 = 0;
        int i2 = 0;
        for(int i = 0; i < s; i++){
            Scanner value = new Scanner(System.in);
            array[i] = value.nextInt();
            summ_FOR += array[i];
        }
        System.out.println( "The sum of array(for): " + summ_FOR);
        while (i1 < s){
            summ_While += array[i1];
            i1++;
        }
        System.out.println( "The sum of array(while): " + summ_While);
        do{
            summ_DO_While += array[i2];
            i2++;
        }while(i2 < s);
        System.out.println( "The sum of array(while+do): " + summ_DO_While);
    }
}
