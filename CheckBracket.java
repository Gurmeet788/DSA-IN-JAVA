import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    static int count = 0;
    public static boolean validBracket(String expr){

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++){

            char cha = expr.charAt(i);

            if (cha != '(' && cha != ')' && cha != '{' && cha != '}' && cha != '[' && cha != ']'){
                count ++;
                continue;
            }
            if (cha == '[' || cha == '(' || cha == '{'){
                stack.push(cha);
                count ++;
                continue;
            }

            if (stack.isEmpty()){
                count ++;
                return false;
            }

            int top = stack.pop();

            if (cha != top + 1 && cha != top + 2){
                count ++;
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String exp = scanner.nextLine();
            if (validBarket(exp)){
                System.out.println("Succuful");
            }else {
                System.out.println(count);
                count = 0;
            }
        }
    }
}
