package Ex08_If_Else_Condition;
//import java.util.scanner;

import java.util.Scanner;

public class Ex019_If_Else_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // <-- eats up the leftover newline

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Name: " + name + ", Age: " + age);
    }
    }


