package EX17_OOPS;
/*
Create a class Rectangle with:

variables: length and width

a method calculateArea() that returns the area.
In main, create an object, assign values, and print the area.

Goal: Learn how to define methods and return values.
 */
public class Lab37_Rectangle_Area {

    double length;
    double width;
    double area;

    double calculatearea()
    {
        area =length*width;
        return area;
    }
    public static void main(String[] args) {

        Lab37_Rectangle_Area a1= new Lab37_Rectangle_Area();
        a1.length = 13;
        a1.width =15;
        System.out.println(a1.calculatearea());
    }
}
