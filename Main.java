package EmpolyeSystem;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int number;
        ReadEmployeeDetails read=new ReadEmployeeDetails();
        EmployeeOperations employeeOperations=new EmployeeOperations();
        Scanner sc=new Scanner(System.in);
        System.out.println("Hai Welcome to employee Management System ");
        System.out.println("Enter 1 to add Employee");
        System.out.println("Enter 2 to Remove Employee");
        System.out.println("Enter 3 to Search an Employee");
        number=sc.nextInt();

        switch (number){
            case 1:
                System.out.println("Monday");
                read.askEmployeeDetails();
                break;
            case 2:
                System.out.println("Tuesday");
                employeeOperations.removeEmployee();
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }



    }
}
