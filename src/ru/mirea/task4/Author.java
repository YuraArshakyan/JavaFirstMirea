package ru.mirea.task4;

public class Author {
    String name;
    String email;
    char gender;
    public Author(){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return "name: " + name + '\n' + "email: " + email + '\n' + "gender: " + gender;
    }
}
