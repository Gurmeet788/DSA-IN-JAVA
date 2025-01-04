public class LinkListArray {
    public static void main(String[] args) {
        int array[] = {1,2,8,7,9};
        Node head = covertArr(array);
        head = insertKthvalue(head, 55, 8);
        printFull(head);
    }

    private static void printFull(Node head){  // for printing linked list
        Node temp = head;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.gettNext();
        }
    }

    private static int search(Node head, int target){
        Node temp = head;
        int count = 1;
        while (temp != null) {
            if (temp.getData() == target) {
                return count;
            }else{
                temp = temp.gettNext();
                count++;
            }
        }
        return 0;
    }

    private static int lengthList(Node head){ //To find length of linked list 
        Node temp = head;
        int count = 0;
        while(temp != null){
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

    private static Node removeHead(Node head){ //Remove Head (first node)

        if(head == null){
            return head;
        }
        head = head.gettNext();
        return head;
    }

    private static Node removeTail(Node head){  // remove the last node
        
        if (head == null || head.gettNext() == null) { // linkedlist is empty or if linkedlist have one element

            return null;
        }
        Node temp = head;
        while (temp.gettNext().gettNext() != null) {
            
            temp = temp.gettNext();
        }
        temp.SetNext(null);

        return head;
    }

    private static Node removeKth(Node head , int k){  // remove kth node but there is one problem if k is greater than length of linkedlist then it will not remove any node give error

        if (head == null) {
            return head;
        }

        if (k == 1) {
            removeHead(head);
        }

        Node temp = head;

        for(int i = 1; i < k; i++){

            if (i == k - 1) {
                temp.SetNext(temp.gettNext().gettNext());
            }
            temp = temp.gettNext();
        }

        return head;

    }

    public static Node removeKthNode(Node head, int k) { // remove kth node with error handling
        if (head == null) {
            return head;
        }

        if (k == 1) {
            return removeHead(head);
        }

        Node temp = head;
        int count = 0;
        Node prev = null;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.SetNext(temp.gettNext());
                break;
            }
            prev = temp;
            temp = temp.gettNext();
            
        }

        return head;
    }

    public static Node removeValueNode(Node head, int value) { // remove value node 

        Node temp = head;
        Node prev = null;

        if (head == null) {
            return head;
        }

        if (head.getData() == value) {
            return removeHead(head);
        }

        while (temp != null) {
            if (temp.getData() == value) {
                prev.SetNext(temp.gettNext());
                break;
            }
            prev = temp;
            temp = temp.gettNext();
            
        }

        return head;
    }

    public static Node insertHead(Node head, int value){   // Insert at first
        Node newNode = new Node(value, head);
        return newNode;
    }

    public static Node insertLast(Node head, int value){  // Insert at last
        Node newNode = new Node(value);

        if (head == null) {

            return head = newNode;
        }
        Node temp = head;
        
        while (temp.gettNext() != null) {

            temp = temp.gettNext();            
        }
        temp.SetNext(newNode);
        return head;
    }

    public static Node insertKthNode(Node head, int value, int k){ // insert at kth postion

        if (k == 1) {

            return insertHead(head, value);
        }
        if (head == null && k > 1) {

            System.out.println("Not possiable");

            return null;
        }

        Node newNode = new Node(value);
        Node curr = head;

        for(int i = 1; i < k; i++){

            if (i == k - 1 ) {

                newNode.SetNext(curr.gettNext());

                curr.SetNext(newNode);
            }
            curr = curr.gettNext();
        }
        return head;
    }

    public static Node insertKthvalue(Node head, int value, int k){ //Insert at kth value

        if (head == null || head.getData() == k) {

            return insertHead(head, value);
        }

        Node newNode = new Node(value);
        Node curr = head;
        boolean flage = false;
        while (curr.gettNext() != null) {
            
            if (curr.gettNext().getData() == k) {
                
                newNode.SetNext(curr.gettNext());

                curr.SetNext(newNode);

                flage = true;
                break;
            }
            curr = curr.gettNext();
        }

        if (flage == false) {

            System.out.println("Value not found");
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
