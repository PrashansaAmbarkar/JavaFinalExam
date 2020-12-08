/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class Employee implements Comparable<Employee>{
    private int empId;
    private String empName;
    private double Salary;

    /**
     *
     * @param empId
     * @param empName
     * @param Salary
     */
    public Employee(int empId, String empName, double Salary) {
        this.empId = empId;
        this.empName = empName;
        this.Salary = Salary;
    }

    /**
     *
     * @return
     */
    public int getEmpId() {
        return empId;
    }

    /**
     *
     * @return
     */
    public String getEmpName() {
        return empName;
    }

    /**
     *
     * @return
     */
    public double getSalary() {
        return Salary;
    }

    /**
     *
     * @param empId
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     *
     * @param empName
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     *
     * @param Salary
     */
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Employee Id: " + empId + " ,Employee Name: " + empName + " ,Salary: " + Salary ;
    }

    /**
     *
     * @param emp
     * @return
     */
    @Override
    public int compareTo(Employee emp) {
        if(this.getEmpId() > emp.getEmpId())
            return 1;
        else
            return -1;
    }
    
    
}
