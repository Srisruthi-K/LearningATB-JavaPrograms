package TEst;

public class JavaOOPS_2_Student {

    String name;
    int roll_No;
    char section;
    JavaOOPS_2_Student(String name, int roll_No, char section)
    {
this.name =name;
this.roll_No=roll_No;
this.section = section;

    }

    void display()
    {
        System.out.println("Student :" + name+ "  Roll No : "+roll_No+" Section : "+section);
    }

    public static void main(String[] args) {
        JavaOOPS_2_Student s1= new JavaOOPS_2_Student("Bob", 101, 'A');
s1.display();
    }
}
