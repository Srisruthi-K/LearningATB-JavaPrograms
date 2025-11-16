package EX17_OOPS;
/*
Exercise 1 – “Book Info”
Create a class Book with:

variables: title, author, and price

a method displayInfo() that prints the details.
In the main method, create two Book objects and call displayInfo() for each.

Goal: Understand how to create objects and call methods.
 */

public class Lab038_book {
    public static void main(String[] args) {
        Lab038_book b1=new Lab038_book();
        Lab038_book b2 = new Lab038_book();
        b1.title="Smalls wins every day";
        b1.author ="Luke Continuo";
        b1.price =399;
        b2.title="Friends";
        b2.author ="Fedrick";
        b2.price =799;
        b1.displayinfo();
        b2.displayinfo();

    }
    String title;
    String author;
    int price;

    void displayinfo()
    {
       System.out.println("Title :" + title + ", Author :  "+ author + ", Price :  " +price);

    }

}
