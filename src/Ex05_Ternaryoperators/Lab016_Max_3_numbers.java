package Ex05_Ternaryoperators;

public class Lab016_Max_3_numbers {
    public static void main(String[] args) {
    int n1 = 2;
    int n2 = 9;
    int n3 = -11;
    String Max_number= (n1 > n2) ? ((n1 > n3) ? "n1 is the max number" : "n3 is the max number") : ((n2 > n3) ? " n2 is the max number" : "n3 is the mx number");
        System.out.println(Max_number);

    //when the output is int and printing it as a string.

    int max= (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.printf("The maximum number is %d%n " , max);
        System.out.println("The maximum number is " + max);

}}
