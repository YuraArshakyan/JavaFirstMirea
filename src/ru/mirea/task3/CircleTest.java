package ru.mirea.task3;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle testCircl = new Circle();
        System.out.println("input r");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        testCircl.set_r(r);
        System.out.println("input d");
        Scanner scan1 = new Scanner(System.in);
        int d = scan1.nextInt();
        testCircl.set_d(d);
        System.out.println("input s");
        Scanner scan2 = new Scanner(System.in);
        int s = scan2.nextInt();
        testCircl.set_s(s);
        System.out.println(testCircl);
    }
}
