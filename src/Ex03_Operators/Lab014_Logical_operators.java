package Ex03_Operators;

public class Lab014_Logical_operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(!a);
        System.out.println(!b);
        System.out.println(!!b);
        System.out.println(a && b);
        System.out.println(a || b);

        int age = 20;
        boolean isStudent = true;

        if (age > 18 && isStudent) {
            System.out.println("Adult student");
        }

        if (age < 18 || isStudent) {
            System.out.println("Either minor or a student");


        }
    }}
