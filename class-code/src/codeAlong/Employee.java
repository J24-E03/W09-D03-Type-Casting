package codeAlong;

import java.util.Random;

public abstract class Employee {
    private final int id;
    private String name;
    private double salary;
    private static int idIncrement = 0;
    private static String companyName = "Tech Solutions";
    Random random = new Random();


    public Employee(String name, double salary){
        int randomNumber = random.nextInt(2);
        idIncrement+=1;
        this.id = randomNumber + idIncrement;
        this.salary = salary;
        this.name = name;
    }

    public abstract double calculateBonus();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public final String getCompanyName(){
        return companyName;
    }

    @Override
    public String toString() {
        return "codeAlong.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
