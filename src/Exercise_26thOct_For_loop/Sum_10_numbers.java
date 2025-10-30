package Exercise_26thOct_For_loop;

public class Sum_10_numbers {
    public static void main(String[] args) {
        int num=0;
        int i;
        for( i =1;i<=10;i++)
        {
            num=i+num;
        }
        System.out.println(num);
    }
}
