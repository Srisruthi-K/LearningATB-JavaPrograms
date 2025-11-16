package TEst;

public class JavaOOPs_Cha1_Person {
String name;
int age;
     JavaOOPs_Cha1_Person(String name, int age){
         this.name=name;
         this.age=age;
    }


    void display()
    {
        System.out.println( "Name :" + name +"  Age :" + age);
    }

public static void main(String[] args) {

    JavaOOPs_Cha1_Person a= new JavaOOPs_Cha1_Person("John",25);
    JavaOOPs_Cha1_Person b= new JavaOOPs_Cha1_Person("Alice", 30);
a.display();
b.display();
}

}
