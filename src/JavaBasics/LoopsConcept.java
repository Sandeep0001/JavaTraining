package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. while loop
		//disadvantage of while loop: it will generate infinite loop if you don't give incremental or decremental part
		
		int i = 0;//initialization
		while(i<=10){//condition
			System.out.println(i);
			i=i+1;//incremental or decremental 
		}
		
		System.out.println("---------------------");
		//2. for loop
		for(int j=1;j<=10;j++){
			System.out.println(j);
			
		}

	}

}
