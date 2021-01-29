package EmpolyeSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class ReadEmployeeDetails
{
    private String name;
    private int Age;
    private int Salary;
    private String Address;
    int NumberOfEmployee;



    Scanner sc=new Scanner(System.in);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getNumberOfEmployee() {
        return NumberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        NumberOfEmployee = numberOfEmployee;
    }

    public void askEmployeeDetails()
    {
        System.out.println("Choose an option To Store Employee Details ");
        System.out.println("Enter 1 to store all the Employe details ");
        System.out.println("How many Number of Employess do you want to enter");
        setNumberOfEmployee(sc.nextInt());
        readEmployeeDetails(getNumberOfEmployee());

    }
    public void readEmployeeDetails(int NumberOfEmployee)
    {
        LinkedList<Object> EmployeeData=new LinkedList<>();
        for(int i=0;i<NumberOfEmployee;i++)
        {
        System.out.println("Enter"+" "+i+" "+"Employee  Name ");
        setName(sc.next());
        System.out.println("Enter"+" "+i+" "+" Employee Age ");
        setAge(sc.nextInt());
        System.out.println("Enter"+" "+i+" "+" Employee City ");
        setAddress(sc.next());
        System.out.println("Enter "+" "+i+" "+"Employee Salary ");
        setSalary(sc.nextInt());
        EmployeeData.add(getName());EmployeeData.add(getAge());EmployeeData.add(getSalary());EmployeeData.add(getAddress());
        }
        System.out.println("Employee Details = "+" "+EmployeeData);
        EmployeeOperations employeeOperations =new EmployeeOperations(EmployeeData);
        employeeOperations.sort();
    }

}
