import java.util.*;
public class ValidAnogram {
    public static void main(String[] args) {
        String s,t;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter your 1st word:");
        s=SC.nextLine();
        System.out.println("Enter your Second word:");
        t=SC.nextLine();
        if(cheakAnogram(s, t))
            System.out.println(s+" is Anogram of "+t);
        else
        System.out.println(s+" is not Anogram of "+t);
    }

    //Function to cheak your word is Anogram to another word

    public static boolean cheakAnogram(String s,String t){ 
        
        //Convert the string into Char array to call .toCharArray() function
        
        char[]arrayS=s.toCharArray();
        char[]arrayT=t.toCharArray();

        // Sorting both array to call Arrays.sort(array name) function

        Arrays.sort(arrayS);
        Arrays.sort(arrayT);

        //Make it again in String form

        String SortedS=new String(arrayS);
        String SortedT=new String(arrayT);

        //Compare if both are equal return true not false

        if ( SortedS.equals(SortedT)) 
            return true;
        else
        return false;
    }
}