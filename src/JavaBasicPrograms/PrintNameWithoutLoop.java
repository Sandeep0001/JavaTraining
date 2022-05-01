package JavaBasicPrograms;

public class PrintNameWithoutLoop {

    //print your name 1000 times without using any loop in your code

    public static void main(String[] args) {

        //1st approach
        String name = "Sandeep";
        String s = "i";

        s = s.replace("i", "iiiiiiiiii"); //10
        s = s.replace("i", "iiiiiiiiii"); //10 * 10 = 100
        s = s.replace("i", "iiiiiiiiii"); //100 * 10 = 1000

        s = s.replace("i", name + "\n");
        System.out.println(s);

        //2nd approach
        String name2 = "Sandeep" + "\n";
        System.out.println(name2.repeat(1000));

        //3rd approach using recursion

        int counter = 1;

        if (counter <= 1000) {
            System.out.println("Sandeep");
            counter++;
            main(null);
        }  //throws Stackoverflow error when number is value is higher than 100000times


        //4th approach using streams

        String name3 = "Test";
        java.util.stream.Stream.iterate(name3, n -> name3).limit(1000).forEach(System.out::println);


    }

}
