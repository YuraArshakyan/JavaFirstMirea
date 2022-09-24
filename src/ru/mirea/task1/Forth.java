package ru.mirea.task1;
import java.util.Scanner;

public class Forth {
    public int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String []args) {
        int s;
        Forth Object_of_method = new Forth();
        for(int i = 0; i <= 5; i++){
            Scanner value = new Scanner(System.in);
            s = value.nextInt();
            Object_of_method.getFactorial(s);
        }
    }
}
