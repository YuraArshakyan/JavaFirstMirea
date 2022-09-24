package ru.mirea.task3;
import java.lang.String;

public class Book {
    public String author;
    public int Year;
    public String Title;
    public void set_Author(String auth){
        author = auth;
    }
    public void set_Year(int y){
        Year = y;
    }
    public void set_Title(String title){
        Title = title;
    }
    public String toString(){
        return "name of author: " + author + "\n Year of writing the book: " + Year + "\n Title of book: "+ Title;
    }
}
