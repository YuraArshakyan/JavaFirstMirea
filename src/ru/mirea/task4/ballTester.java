package ru.mirea.task4;

public class ballTester {
    public static void main(String[] args) {
        Ball newBall = new Ball(10.2, 41.45);
        System.out.println("\nBall cords before move: \n");
        System.out.println(newBall);
        newBall.move(100.5,600.78);
        System.out.println("\nBall cords after move: \n");
        System.out.println(newBall);
    }
}