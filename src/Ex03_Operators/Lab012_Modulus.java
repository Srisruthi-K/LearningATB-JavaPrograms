package Ex03_Operators;

public class Lab012_Modulus {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        System.out.println(x % y);   // 10 % 3 = 1 reminder
        System.out.println(15 % 4);  // 15 % 4 = 3
        System.out.println(20 % 5);  // 20 % 5 = 0
        System.out.println(-10 % 3); // -10 % 3 = -1
        System.out.println(10 % -3); // 10 % -3 = 1
    }
}
