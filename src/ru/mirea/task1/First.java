package ru.mirea.task1;
import java.util.Scanner;
public class First {
    public static void main(String []args) {
        System.out.println("Enter the length of array");
        Scanner scan_of_num = new Scanner(System.in);
        int s  = scan_of_num.nextInt();
        int[] array;
        array = new int[s];
        int summ = 0;
        for(int i = 0; i < s; i++){
            Scanner value = new Scanner(System.in);
            array[i] = value.nextInt();
            summ += array[i];
        }
        System.out.println( "The sum of array: " + summ); // Вывод сообщения на экран
    }
}
