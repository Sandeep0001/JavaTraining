package programs.OOP;


import java.util.HashMap;
import java.util.Map;

/**
 * Why HashMap Key should be immutable in Java?
 * Why String is popular HashMap key in Java?*/

public class TestMap {

    public static void main(String[] args) {

        Map<Employee, String> empMap = new HashMap<>();

        Employee e1 = new Employee("Shambu", 23);

        empMap.put(e1, "Full Time Employee");

        System.out.println(empMap.get(e1)); //Full Time Employee

        //since Employee is mutable obj, when we set age the hashmap will return null
        e1.setAge(25);
        System.out.println(empMap.get(e1));//null



        //Whenever you create Hashmap its better to use immutable object like String

        Map<String, Integer> m1 = new HashMap<>();

        m1.put("Rama", 100);

        System.out.println(m1.get("Rama")); //100

        m1.put("Sandeep", 200);

        System.out.println(m1.get("Sandeep")); //200

        System.out.println(m1.get("Rama"));//100

    }



}
