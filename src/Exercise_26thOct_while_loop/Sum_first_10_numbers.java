package Exercise_26thOct_while_loop;

public class Sum_first_10_numbers {
    public static void main(String[] args) {
        int i=1;
        int num=0;
        while(i<=10)
        {
            num=i+num;
            i++;

        }
        System.out.println(num);
    }
}
