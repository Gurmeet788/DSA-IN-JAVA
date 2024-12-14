public class LinkListArray {
    public static void main(String[] args) {
        int array[] = {1,2,8,7,9};
        Node head = covertArr(array);
        System.out.println(head.getData());
    }

    private static Node covertArr(int array[]){
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
class Node{
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
