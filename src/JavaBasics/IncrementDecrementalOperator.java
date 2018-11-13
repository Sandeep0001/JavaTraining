package JavaBasics;

public class IncrementDecrementalOperator {

	public static void main(String[] args) {
		//++
		//--
		
		System.out.println("post increment");
		int i = 1;
		int j = i++;//post increment
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("pre increment");
		int a = 1;
		int b = ++a;//pre increment
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("post decrement");
		int m = 2;
		int n = m--;//post decrement
		
		System.out.println(m);
		System.out.println(n);
		
		System.out.println("pre decrement");
		int p = 2;
		int q = --p;
		
		System.out.println(p);
		System.out.println(q);
		
	}

}
