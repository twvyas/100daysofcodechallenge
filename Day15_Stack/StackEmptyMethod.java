/*
Topic : Stack
Stack Class empty() Method
The empty() method of the Stack class check the stack is empty or not. If the stack is empty, it returns true, else returns false.

Syntax: public boolean empty() 

Returns: The method returns true if the stack is empty, else returns false.

*/
import java.util.Stack;

import javax.swing.Popup;
public class StackEmptyMethod{
    public static void main(String args[]){
        Stack<Integer>stk=new Stack<>();    //creating an instance of stack class
        boolean result=stk.empty();     //checking stack is empty or not
        System.out.println("Is the Stack is Empty?"+result);
        stk.push(98);     //pushing elements into stack
        stk.push(789);
        stk.push(86);
        stk.push(102);
        stk.push(677);

        System.out.println("Elements in Stack:"+stk);
        result=stk.empty();
        System.out.println("Is the Stack empty?"+result);
        
    }
}
/*
Explanination:
> Created an instance of the Stack class.
>  After that, invoked the empty() method two times.
   The first time it returns true because we have not pushed any element into the stack. After that, we have pushed elements into the stack.
> Again invoked the empty() method that returns false because the stack is not empty.
*/

/*
 Output:
 Is the Stack is Empty?true
Elements in Stack:[98, 789, 86, 102, 677]
Is the Stack empty?false
PS C:\Users\lenovo\Desktop\java folder> 
 */