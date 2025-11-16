package EX17_OOPS;
/*
Create a Car class with:

variables: brand, model, year

one default constructor (set default values)

one parameterized constructor (set values from arguments)

a method display() to show car details.

In main, create one object using the default constructor and one using the parameterized constructor.

Goal: Practice constructor overloading.
 */

public class Lab_40_Car {
    private String brand;
    private String model;
    private  int year;

    Lab_40_Car()
    {
brand =" Hyundai";
model ="I20";
year =2020;
    }
    Lab_40_Car(String brand, String model, int year)
    {
        this.brand =brand;
        this.model=model;
        this.year =year;
    }
    void display()
    {
        System.out.println(" The Car brand is : " +brand + " ,  model is : " +model + " , year is : "+ year);
    }

    public static void main(String[] args) {
        Lab_40_Car c1= new Lab_40_Car();
        Lab_40_Car c2 = new Lab_40_Car("BMW", "Q7", 2023);

        c1.display();
        c2.display();
    }


}
