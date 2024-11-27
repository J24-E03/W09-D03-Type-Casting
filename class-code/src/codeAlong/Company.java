package codeAlong;

import java.util.HashSet;

public class Company {

   private HashSet<Employee> allEmployees;

    public Company(HashSet<Employee> allEmployees) {
        this.allEmployees = allEmployees;
    }

    public HashSet<Employee> getAllEmployees() {
        return allEmployees;
    }

    public void setAllEmployees(HashSet<Employee> allEmployees) {
        this.allEmployees = allEmployees;
    }

    public void addEmployee(Employee employee){
        allEmployees.add(employee);
    }

    public void removeEmployee(Employee employee){
        allEmployees.remove(employee);
    }

    public Employee addEmployee(String name, double salary, String role){
        if(role.equals("codeAlong.Manager")){
            return new Manager(name,salary);
        }
        else{
            return new Developer(name,salary,"Java");
        }
    }
}
