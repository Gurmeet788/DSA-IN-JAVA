//Just Function approch 
//Time compil = O(N)
//Space compl = o(N) b/c we are using hashmap data strure extra to store the full Node  mean Node adreess
import java.util.HashMap;

public class Linked_List_Cycle {
    public boolean hasCycle(Node head) {

        if(head == null){
            
            return false;
        }

       HashMap<Node,Integer> map =new HashMap<Node,Integer>();

       Node temp = head;
       while(temp.gettNext() != null){
        if(map.containsKey(temp)){

            return true;

        }else{

            map.put(temp,1);
        }

        temp = temp.gettNext();
       }
        
        return false;
    }
}
