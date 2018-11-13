package JavaBasics;

public class TwoDimensionalArrayConcept {

	public static void main(String[] args) {
		
		String s[][] = new String[3][5];
		System.out.println(s.length);//s.length gives total number of rows = 3
		System.out.println(s[0].length);//give you total number of columns = 5
		//1st row
		s[0][0] = "A";
		s[0][1] = "B";
		s[0][2] = "C";
		s[0][3] = "D";
	    s[0][4] = "E";
	    //2nd row
	    s[1][0] = "A1";
		s[1][1] = "B1";
		s[1][2] = "C1";
		s[1][3] = "D1";
	    s[1][4] = "E1";
	    //3rd row
	    s[2][0] = "A2";
		s[2][1] = "B2";
		s[2][2] = "C2";
		s[2][3] = "D2";
	    s[2][4] = "E2";
	    System.out.println(s[0][3]);
	    System.out.println(s[1][2]);
	    
	    //print all the values of 2d array -- use 2 for loops 
	    for(int row=0;row<s.length;row++){
	    	for(int col=0;col<s[0].length;col++){
	    		System.out.println(s[row][col]);
	    	}
	    }

	}

}
