package basics;
/*A Java package organizes Java classes into namespaces, providing a unique namespace for each type it 
contains. Classes in the same package can access each other's package-private and protected members*/

public class ArrayConcept {

	public static void main(String[] args) {

		//array: to store similar data type values in an array variable
		
		//1. int array
		// lowest bound/index = 0
		//upper bound/ index = n-1 (where n is size of an array)
		//one dimensional array
		//dis advantage of array: 
		//1. Size is fixed -- static array --to overcome this problem, we use collections -- ArrayList, HashTable -- use dynamic array. 
		//2. Stores only similar data types -- to overcome this problem, we use Object array.
		System.out.println("int array");
		int i[] = new int[4]; //new is keyword
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[1]);
		System.out.println(i[2]);
		
		//System.out.println(i[4]); //array index out of bound exception
		
		System.out.println(i.length);//length is a method
		
		//print all the values of array: use for loop
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
		
		System.out.println("double array");
		//2. double array
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.64;
		d[2] = 23.55;
		
		System.out.println(d[2]);
		
		//3.char array
		System.out.println("char array");
		char c[] = new char[3];
		c[0] = 'q';
		c[1] = '2';
		c[2] = '3';
		
		System.out.println(c[0]);
		
		//4. boolean array
		System.out.println("boolean array");
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[1]);
		
		//5. String array
		System.out.println("String array");
		String s[] = new String[3];
		s[0] = "Hello";
		s[1] = "Java";
		s[2] = "100";
		//s[3] = "44.33";//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		                 //at JavaBasics.ArrayConcept.main(ArrayConcept.java:62)
		
		System.out.println(s[1]);
		System.out.println(s.length);
		
		//6.Object array: Object is a super class of all the classes -- is used to store different data types
		System.out.println("Object array");
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.43;
		ob[3] = "1/1/1993";
		ob[4] = "M";
		ob[5] = "Bengaluru";
		
		System.out.println(ob[5]);
		
		//to print all the values of object array -- use for loop
		for(int obj=0;obj<ob.length;obj++){
			System.out.println(ob[obj]);
		}
	}
}
