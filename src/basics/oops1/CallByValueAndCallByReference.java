package basics.oops1;

public class CallByValueAndCallByReference {

	int p;
	int q;
	public static void main(String[] args) {

		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 10;
		int y = 20;
		int n = obj.testSum(x, y);//call by value OR pass by value
		System.out.println(n);
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);//call by reference
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}

	public int testSum(int a, int b){
		//a = 30;
		//b = 40;
		int c = a+b;
		return c;
	}
	
	//call by reference
	public void swap(CallByValueAndCallByReference t){
		int temp;
		temp = t.p;//temp = 50
		t.p = t.q;//t.p = 60
		t.q = temp;// t.q = 50
				
	}
}
