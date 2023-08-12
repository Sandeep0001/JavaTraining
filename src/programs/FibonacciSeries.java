package programs;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 10, i = 0, j = 1;
		
		System.out.println("First" + n + "terms: ");
		
		for(int k=1;k<n;++k){
			System.out.println(i);
			
			int sum = i + j;
			i = j;
			j = sum;
		}
	}
}
