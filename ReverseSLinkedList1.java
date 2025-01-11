//This is part one which time com is O(N) but Space com is O(N) the problem is space comp we have to reduce it.

//I am impl just revese function not main function just logic how to revese the linked list 

import java.util.Stack;

public class ReverseSLinkedList1 {
    
    public Node reverseList(Node head) {

        Stack<Integer> s = new Stack<>();

        if(head == null){

            return head;
        }

        Node temp = head;

        while(temp != null){

            s.push(temp.getData());
            temp = temp.gettNext();
        }

        temp = head;
        while(temp != null){

            temp.setData(s.pop());
            temp = temp.gettNext();
        }
        return head;

    }
}
