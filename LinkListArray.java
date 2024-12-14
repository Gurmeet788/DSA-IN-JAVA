public class LinkListArray {
    public static void main(String[] args) {
        int array[] = {1,2,8,7,9};
        Node head = covertArr(array);
        printFull(head);
        int length = lengthList(head);
        System.out.println(length);
    }

    private static void printFull(Node head){  // for printing linked list
        Node temp = head;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.gettNext();
        }
    }


    private static int lengthList(Node head){ //To find length of linked list 
        Node temp = head;
        int count = 0;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.gettNext();
            count++;
        }
        return count;
    }


    private static Node covertArr(int array[]){  //Convert Array in in linkList
        Node head = new Node(array[0]);
        Node mover = head;

        for(int i = 1; i < array.length; i++){
            Node temp = new Node(array[i]);
            mover.SetNext(temp);
            mover = temp;
        }
        return head;
    }
}

class Node{ // Node class
    private int data;
    private Node next;

    Node(){

    }

    Node(int data){
        this.data = data;
    }

    Node (int data, Node next){
        this.data = data;
        this.next = next;
    }

    public int getData(){
        return data;
    }

    public Node gettNext(){
        return next;
    }

    public void setData(int data){
        this.data = data;
    }

    public void SetNext(Node next){
        this.next = next;
    }

}
