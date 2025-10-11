package Ex05_Ternaryoperators;

public class Lab015_Age_classification {
    public static void main(String[] args){
        String input = args[0];
        int age= Integer.parseInt(input);
        String result = age < 18 ? ("Minor") :(age>=60 ? "Senior citizen": "Adult");
        System.out.println(result);

    }


}
