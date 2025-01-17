//Just Function approch 
//Time compil = O(N)
//Space compl = o(1)

//we use tortoise and hare alogo mean we have 2 pointer slow which run 1 step and 2nd fast which run two step 
public class Linked_List_CycleBest {
    public boolean hasCycle(Node head) {
        
        Node slow, fast;
        slow = fast = head;

        while(fast != null && fast.gettNext() != null){ // two conditon b/c if the linear linked Node is even may be odd if one them happen it will stop and return flase

            slow = slow.gettNext();
            fast = fast.gettNext().gettNext();

            if(fast == slow){ // if fast == slow the linked is cycle linkelist why? b/c we move slow by 1 and fast by 2 if we see the distance b/w fast and slow not slow and fast reduce by 1 b/c slow move 1 step and fast move 2 step at one point slow and fast meet mean starting point like they asre in first condtion mean linked list is cycle

                return true;
            }
        }
        return false;
    }
}
