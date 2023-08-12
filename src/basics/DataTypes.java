package basics;

public class DataTypes {

    public static void main(String[] args) {
		/*public - it is access specifier means from every where we can access it
		static - access modifier means we can call this method directly using class name without creating 
				an object of it
		void -  its the return type
		main - method name
		string [] args - in java accept only string type of argument and stores it in a string 
		you can run the java program when you declared this method. program will start main method.*/

        // primitive data types: int, double, char and boolean
        //Primitive types in Java have advantages in term of speed and memory footprint.

        // int data type is a data type which is used to declare integer variables.
        int i = 10;
        System.out.println(i);
        int j = 20;
        System.out.println(j);

        System.out.println(i + j);

        //double
        double d = 66.99;
        System.out.println(d);

        //char
        char c1 = 'a';
        char c2 = '8';

        //boolean
        boolean b1 = true;
        boolean b2 = false;

        //String is a class not a primitive data type but it can be used as a data type
        //internally, String objects save them in a char array

        String s = "Java";
        String s2 = "100";

        System.out.println(s);
    }
}
