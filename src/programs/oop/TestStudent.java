package programs.oop;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student("Rama", 1, 90,15);
        Student s2 = new Student("Krishna", 2, 92,16);
        Student s3 = new Student("Vishnu", 3, 94,15);
        Student s4 = new Student("Shiva", 4, 98,15);
        Student s5 = new Student("Shakti", 5, 100,15);

        //add all the student objects to ArrayList:

        List<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        System.out.println("total students: " + studentList.size()); //5

        for (Student s : studentList){
            System.out.println(s);
        }
        /** total students: 5
         Student{name='Rama', rollNum=1, marks=90, age=15}
         Student{name='Krishna', rollNum=2, marks=92, age=16}
         Student{name='Vishnu', rollNum=3, marks=94, age=15}
         Student{name='Shiva', rollNum=4, marks=98, age=15}
         Student{name='Shakti', rollNum=5, marks=100, age=15}  */


        //2: Using streams
        studentList.stream().forEach(e -> System.out.println(e));
        /** Student{name='Rama', rollNum=1, marks=90, age=15}
         Student{name='Krishna', rollNum=2, marks=92, age=16}
         Student{name='Vishnu', rollNum=3, marks=94, age=15}
         Student{name='Shiva', rollNum=4, marks=98, age=15}
         Student{name='Shakti', rollNum=5, marks=100, age=15}
         */

        //get the name where marks > 95
        studentList.stream().filter(e -> e.getMarks()>95)
                .forEach(e -> System.out.println(e.getName() + " : " + e.getMarks()));

        /** Shiva : 98
         Shakti : 100
         */

        //get the name who got highest marks:
        int hm = studentList.stream().map(e -> e.getMarks()).max(Integer::compare).get();

        System.out.println(hm); //100

        studentList.stream().filter(e -> e.getMarks() == hm).forEach(e -> System.out.println(e));
        // output is : Student{name='Shakti', rollNum=5, marks=100, age=15}


    }

}
