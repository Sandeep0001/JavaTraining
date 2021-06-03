package JavaBasicPrograms.OOP;

public class Student {

    //Find Student name holding highest marks

    private String name;
    private int rollNum;
    private int marks;
    private int age;

    public Student(String name, int rollNum, int marks, int age) {
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }


    //Generate and override toString method (do alt + insert in intellij)
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }
}
