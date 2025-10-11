package Ex05_Ternaryoperators;

public class Lab018_Commandlineinput {
    public static void main(String[] args) {
String input1=args[0];
        String input2=args[1];
        String input3=args[2];
        //to print the values in a single line
        //println does not accept multiple comma-separated arguments.
        //It only accepts one argument (for example, a single string).
        System.out.println(input1 +" " +input2+" " + input3);
        System.out.printf(" %s%n %s%n %s%n", input1, input2, input3);

    }
}
