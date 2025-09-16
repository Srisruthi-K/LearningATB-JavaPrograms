package Java_Basics;

public class Lab005_Final {
    public static void main(String[] args) {
        int a=100;
        System.out.println(a);
         a =101;
        System.out.println(a);
        final int b = 200;
        System.out.println(b);
        //b=202;
        //java: cannot assign a value to final variable b
        //System.out.println(b);
    }
}
