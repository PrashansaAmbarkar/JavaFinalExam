/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(65,"Bruce Wayne", 50000));
        emp.add(new Employee(20,"Aquaman",20000));
        emp.add(new Employee(12,"Tony Stark",90000));
        emp.add(new Employee(9,"Peter",4500));
        emp.add(new Employee(90,"Veronica Rachel",8500));
        
        for(Employee employee : emp ){
            System.out.println(employee.toString());
        }
        
        Collections.sort(emp);
        
        System.out.println("\nSort By ID");
        for(Employee employee : emp ){
            System.out.println(employee.toString());
        }
        
        Comparator<Employee> com = new Comparator<Employee>(){
            
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if(emp1.getSalary() > emp2.getSalary())
                    return 1;
                else
                    return -1;
            }
            
        };
        
        Collections.sort(emp, com);
        
        System.out.println("\nSort By Salary");
        for(Employee employee : emp ){
            System.out.println(employee.toString());
        }
        
        Comparator<Employee> com2 = new Comparator<Employee>(){
            
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmpName().compareTo(emp2.getEmpName());
            }
            
        };
        
        Collections.sort(emp, com2);
        
        System.out.println("\nSort By Name");
        for(Employee employee : emp ){
            System.out.println(employee.toString());
        }
    }
    
}
