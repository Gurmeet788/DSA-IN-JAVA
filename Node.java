public class Node {

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
