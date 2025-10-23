package Exercise_Arrays;

import java.util.Scanner;

public class Inverted_Right_Triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //char a[][]= new char[3][3];
        System.out.println ("Enter the pattern character");
        String a=sc.next();
        System.out.println("Enter the depth of triangle");
        int d=sc.nextInt();
        for(int i=0; i<=d;i++)
        {
            for(int j=d;j>i;j--)
            {
                System.out.print(a);
            }
            System.out.println("");
        }
    }
}
