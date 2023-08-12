package datastrutures.stack;

public class StackImpUsingJavaArray {

    int size;
    int arr[];
    int top;

    StackImpUsingJavaArray(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }


    //time complexity is: O(1)
    public void push(int element){

        if(!isFull()){
            top++;
            arr[top] = element;
            System.out.println("pushed element is : " + element);
        }
        else {
            System.out.println("Stack is full");
        }

    }

    public int pop(){

        if(!isEmpty()){
            int returnTop = top;
            top--;
            System.out.println("popped element is : " + arr[returnTop]);
            return arr[returnTop];
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }

    }



    public int peek(){

        if(!this.isEmpty()){
            return arr[top];
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }

    }


    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (size-1 == top);
    }


    public static void main(String[] args){
        StackImpUsingJavaArray stackImp = new StackImpUsingJavaArray(10);
        stackImp.pop(); //Stack is empty

        System.out.println("--------------------------");
        stackImp.push(100);
        stackImp.push(200);
        stackImp.push(1300);
        stackImp.push(10);

        System.out.println("-------------------------");

        System.out.println("Peek element in stack is: " + stackImp.peek()); //10

        stackImp.pop(); //popped element is : 10
        stackImp.pop(); //popped element is : 1300
        stackImp.pop(); //popped element is : 200

        System.out.println(stackImp.isEmpty()); //false
        System.out.println(stackImp.isFull()); //false


    }

}
