import java.util.*;

public class StackArray {
    int top = -1;
    int size = 10;
    int array[] = new int[size];

    public void push(int a)throws NullPointerException{

        if (top + 1 >= size) {
            throw new NullPointerException();
        }
        ++top;
        array[top] = a; 

        /*
         array[++top] = a;
         */
    }

    public int pop() throws EmptyStackException{
        int dublicate = top ;
        
        if (top == -1) {
            throw new EmptyStackException();
        }else{
            top --;
        }
        return array[dublicate];

        /*
          Instead of make dublicate variable we can do return array[top--];
         */
    }

    public int top() throws EmptyStackException{

        if (top == -1) {
            throw new EmptyStackException();
        }else{
            return array[top];
        }
    }

    public static void main(String[] args) {

        StackArrary stack = new StackArrary();

        stack.push(5);
        stack.push(10);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
    }
}
