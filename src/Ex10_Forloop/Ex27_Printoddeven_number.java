package Ex10_Forloop;

public class Ex27_Printoddeven_number {
    public static void main(String[] args){
        //for printing odd and even numbers from 1 to 50
        for (int i=1;i<=50;i++)
        {
            if(i%2==0){
                System.out.println("Even number->" + i);
            }
           // else
              //  System.out.println("odd number->" + i);
        }
    }
}
