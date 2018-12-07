package JavaBasicPrograms;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {

		String s;
		int i = 0;
		System.out.println("Enter any word to find its length");
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextLine();
		
		System.out.println("The string object is:" + s);
		
		for(char c : s.toCharArray()){
			i++;
		}
		
		System.out.println("The length of the entered word is: " + i);
	}

}
