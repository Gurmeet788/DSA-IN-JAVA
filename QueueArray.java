public class QueueArray {

    int front = -1;
    int rear = -1;
    int N = 10;
    int size = 0;
    int array[] = new int[N];
    public static void main(String[] args) {
        
        QueueArray queueArray = new QueueArray();

        queueArray.enqueue(4);
        System.out.println(queueArray.peakValue());
        queueArray.dequeue();
        System.out.println(queueArray.front);
        System.out.println(queueArray.rear);
        queueArray.enqueue(5);
        System.out.println(queueArray.peakValue());
    }

    public void enqueue(int value){

        if (rear + 1 >= N) {

            System.out.println("Queue is full");
        }

        if (isEmpty()) {

            front++;
        }
            array[++rear] = value;

            size++;
    }

    public int dequeue() {

        if (isEmpty()) {

            System.out.println("Null Queue");
        }

        int frontVal = array[front];

        if (front == rear) {

            //reset the queue when the the last is dequeue
            front = -1;
            rear = -1;

        }else{

            front++;
        }
        size--;
        return frontVal;
    }

    public int peakValue(){

        if (isEmpty()) {

            System.out.println("Null Queue");
        }

        return array[front];
    }


    public int size(){

        return size;
    }

    public boolean isEmpty(){

        if (front == -1) {

            return true;
        }
        return false;
    }
}
