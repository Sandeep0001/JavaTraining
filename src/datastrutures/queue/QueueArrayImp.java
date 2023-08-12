package datastrutures.queue;

public class QueueArrayImp {

    //FIFO -> First in First Out
    //front --> is used to remove the data
    //rear --> is used to add the data

    int capacity;
    int queueArr[];
    int front;
    int rear;
    int currentSize;

    public QueueArrayImp(int sizeOfQueue){

        this.capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        queueArr = new int[this.capacity];

    }


    //this method is used to add element in the queue
    public void enqueue(int data){
        if (isFull()){
            System.out.println("hey, queue is full");
        }
        else {
            rear++;
            if(rear == capacity){
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data + " added to the queue");
        }

    }


    //this method is used to removed the element from front of the queue
    public void dequeue(){
        if (isEmpty()){
            System.out.println("hey, queue is empty, cannot delete element");
        }
        else {
            front++;
            if (front == capacity){
                System.out.println(queueArr[front-1] + " removed from the queue");
                front = 0;
            }else {
                System.out.println(queueArr[front-1] + " removed from the queue");
            }
            currentSize--;
        }
    }




    public boolean isFull(){
        if (currentSize == capacity){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (currentSize == 0){
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {

        QueueArrayImp obj = new QueueArrayImp(5);

        obj.enqueue(10); //10 added to the queue
        obj.enqueue(20); //20 added to the queue
        obj.dequeue(); //10 removed from the queue

        obj.enqueue(40);
        obj.enqueue(50);
        obj.enqueue(400);
        obj.enqueue(5);
        obj.enqueue(100); //hey, queue is full
        obj.dequeue();
        obj.enqueue(200);
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();

    }

}
