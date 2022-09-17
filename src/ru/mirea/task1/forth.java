package ru.mirea.task1;
import java.util.Scanner;

public class forth {
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String []args) {
        int s;
        forth Object_of_method = new forth();
        for(int i = 0; i <= 5; i++){
            Scanner value = new Scanner(System.in);
            s = value.nextInt();
            Object_of_method.getFactorial(s);
        }
    }
}
