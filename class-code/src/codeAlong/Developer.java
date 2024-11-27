package codeAlong;

import java.util.Arrays;
import java.util.HashSet;

public class Developer extends Employee implements Department{

    private String programmingLanguage;
    private static HashSet<String> possibleLanguages = new HashSet<>(Arrays.asList("Java","Python","Javascript"));


    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * .2;
    }

    public static void addProgrammingLanguage(String newLanguage){
        if(possibleLanguages.add(newLanguage)){
            System.out.println("Programming Language successfully added");
        }
        else{
            System.out.println("Programming language already available");
        }

    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public String getDepartmentName() {
        return "";
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(possibleLanguages.contains(programmingLanguage)){
            System.out.println("Language not available at the moment, please add using the addProgrammingLanguage method");
        }
        else{
            this.programmingLanguage = programmingLanguage;
        }
    }

    public static HashSet<String> getPossibleLanguages() {
        return possibleLanguages;
    }

    public static void setPossibleLanguages(HashSet<String> possibleLanguages) {
        Developer.possibleLanguages = possibleLanguages;
    }



    @Override
    public String toString() {
        return "codeAlong.Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                "} " + super.toString();
    }
}
