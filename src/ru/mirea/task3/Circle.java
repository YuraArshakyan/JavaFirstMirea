package ru.mirea.task3;

public class Circle {
    public int r;
    public int d;
    public int s;
    public void set_r(int n){
        r = n;
    }
    public void set_d(int n){
        d = n;
    }
    public void set_s(int n){
        s = n;
    }
    public String toString(){
     return "circle r = " + r + "\n" + "circle d = " + d + "\n" + "circle s = " + s;
    }
}
