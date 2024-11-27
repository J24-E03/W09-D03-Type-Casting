package codeAlong;

public class Manager extends Employee implements Department{

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public String getDepartmentName() {
        return "";
    }

    @Override
    public double calculateBonus() {
        return getSalary() * .3;
    }

}
