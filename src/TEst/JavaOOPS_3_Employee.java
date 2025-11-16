package TEst;

public class JavaOOPS_3_Employee {

    private int id;
    private String name;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


/*    JavaOOPS_3_Employee()
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }*/

    public static void main(String[] args) {
        JavaOOPS_3_Employee e1= new JavaOOPS_3_Employee();
        e1.setName("John Doe");
        e1.setId(1);
        e1.setSalary(50000);
        System.out.println("Employee ID:" +e1.getId()+
                " Employee Name: " + e1.getName() +
                " Employee Salary: "+e1.getSalary());

    }
}
