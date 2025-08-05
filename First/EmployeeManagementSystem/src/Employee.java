public class Employee {

    private static int val;
    private String employeeName;
    private String employeeDesignation;
    private double employeeSalary;
    private String employeeDob;
    private Address employeeAddress;
    private int age;

    public void justForPracticeStatic(){
        System.out.println(val);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDob() {
        return employeeDob;
    }

    public void setEmployeeDob(String employeeDob) {
        this.employeeDob = employeeDob;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

//    public Employee() {
//        this("Neha", "UP");
//        this.employeeName = "Niharika Singh";
//        this.employeeDesignation = "Associate Manager";
//        this.employeeSalary = 9500000;
//        this.employeeDob = "09/01/2022";
//        this.employeeAddress = "Uttar Pradesh";
//        this.age = 24;
//    }

    public Employee(String employeeName, Address employeeAddress) {
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
    }
    public Employee(String employeeName, Address employeeAddress,String employeeDesignation, double employeeSalary, int age, String employeeDob){
        this(employeeName, employeeAddress);
        this.employeeDesignation=employeeDesignation;
        this.employeeSalary=employeeSalary;
        this.age=age;
        this.employeeDob=employeeDob;

    }


//    @Override
//    public String toString() {
//        return "Employee{" +
//                "employeeName='" + employeeName + '\'' +
//                ", employeeDesignation='" + employeeDesignation + '\'' +
//                ", employeeSalary=" + employeeSalary +
//                ", employeeDob='" + employeeDob + '\'' +
//                ", employeeAddress='" + employeeAddress + '\'' +
//                ", age=" + age +
//                '}';
//    }
    public void display(){
        System.out.println("Name: "+employeeName);
        System.out.println("Designation: "+employeeDesignation);
        System.out.println("Salaray: "+employeeSalary);
        System.out.println("DOB: "+employeeDob);
        System.out.println("Address: "+employeeAddress.toString());
        System.out.println("Age: "+age);
    }

}