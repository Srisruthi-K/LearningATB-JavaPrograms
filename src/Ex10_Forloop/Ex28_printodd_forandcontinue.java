package Ex10_Forloop;

public class Ex28_printodd_forandcontinue {
    public static void main (String [] args) {

        for (int i = 0; i < 50; i++) {
             if (i % 2 == 0)
            {
                continue;
            }
            System.out.println(i);//this prints the odd number
        }


    }}