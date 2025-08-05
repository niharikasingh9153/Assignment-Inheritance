//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Employee e = new Employee();
//            System.out.println(e);
        Address a = new Address("Bangalore", "Karnataka",560004);
//        Employee e1 = new Employee("Niharika", a);
//        e1.display();

//        Employee e2 = new Employee("Nisha",a,"Ms",6000000,24,"09012002");
//        e2.display();
        Person p1=new Person("Nikku", 23 ,a);

        EmployeeNew empnew = new EmployeeNew(p1.getName(),p1.getAge(),a,21,"Associate Manager", 600000);
        empnew.applyForLeave();




        Student s1= new Student(p1.getName(), p1.getAge(), a,63,"9.2gpa" );
        System.out.println(s1);
        System.out.println(empnew);






    }
}