package EX17_OOPS;

/*

Exercise 3 – “Student Details with Constructor”
Create a Student class with:
instance variables: name, rollNo, marks

a parameterized constructor to initialize them

a method display() to print the student details.

In main, create 2 Student objects using the constructor and display their details.

Goal: Understand parameterized constructors.
 */

public class Lab39_Student_Constructor {

    String name;
    int rollno;
    int marks;

    Lab39_Student_Constructor(String obj_name,int obj_roll, int obj_marks) {
        name = obj_name;
        rollno = obj_roll;
        marks = obj_marks;
    }
        void display()
        {
           System.out.println("name is " + name + " , roll no: " + rollno + " , marks : "+ marks);
        }

    public static void main(String[] args) {
        Lab39_Student_Constructor s1= new Lab39_Student_Constructor("Sruthi",23,90);
        Lab39_Student_Constructor s2 = new Lab39_Student_Constructor("Suhail",34,98);
        s1.display();
        s2.display();
    }
}
