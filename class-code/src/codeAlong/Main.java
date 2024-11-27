package codeAlong;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Map<String, List<Employee>> departments = new HashMap<>();

        Employee dev1 = new Developer("Steve Jobs",100000,"Java");
        Employee dev2 = new Developer("Dan Abramov",10000,"Javascript");


        departments.put("Head Office",new ArrayList<>(List.of(dev1)));

        System.out.println(departments.get("Head Office").add(dev2));
//        System.out.println(departments.get("Head Office").remove(dev2));
        System.out.println(departments.get("Head Office"));



        System.out.println(departments);




    }
}