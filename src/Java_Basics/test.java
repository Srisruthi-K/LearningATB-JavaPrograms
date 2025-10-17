package Java_Basics;

public class test {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = s1.intern();   // moves to pool

        String s3 = "Hello";
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3)); // true


    }


}
