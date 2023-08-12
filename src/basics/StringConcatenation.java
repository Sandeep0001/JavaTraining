package basics;

public class StringConcatenation {

	public static void main(String[] args) {
		// + sign is a concatenation operator
		// println is used to print on the console with a new line
		// print is just used to print on the console
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double d = 20.33;
		double d2 = 21.5;
		
		System.out.println(a+b);
		System.out.println(x +" "+ y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(x+y+d+d2);
		System.out.println("The addition of a and b is:"+(a+b));
		System.out.print("Hello");
		System.out.println("who is this");
	}
}
