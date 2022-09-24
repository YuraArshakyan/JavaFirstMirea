package ru.mirea.task3;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book Test_book = new Book();
        System.out.println("Enter author of book");
        Scanner Author_scan = new Scanner(System.in);
        String Author = Author_scan.next();
        Test_book.set_Author(Author);
        System.out.println("Enter year of writing the book");
        Scanner Year_scan = new Scanner(System.in);
        int year = Year_scan.nextInt();
        Test_book.set_Year(year);
        System.out.println("Enter the title of book");
        Scanner Title = new Scanner(System.in);
        String title = Title.next();
        Test_book.set_Title(title);
        System.out.println(Test_book);
    }
}
