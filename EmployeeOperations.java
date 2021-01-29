package EmpolyeSystem;

import java.util.*;

public class EmployeeOperations
{

     LinkedList<Object> EmployeeOperations;

    public EmployeeOperations() {
    }

    public EmployeeOperations(LinkedList<Object> sortedEmployeeData) {
        EmployeeOperations = sortedEmployeeData;
    }

        //Sorting of Employee
    public void sort() {
        ListIterator<Object> listIterator = EmployeeOperations.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Iteratoe List==" + " " + listIterator.next());
        }
    }

        //Removing Employee by Name
        public void removeEmployee()
    {

            if (EmployeeOperations.indexOf(0) == EmployeeOperations.indexOf(3)) {
                EmployeeOperations.remove(0);
                System.out.println(EmployeeOperations);
            } else
                System.out.println("else==" + EmployeeOperations);
        }
    }

