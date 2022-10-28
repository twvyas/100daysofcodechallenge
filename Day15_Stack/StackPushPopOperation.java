/*
Topic : Stack 

Stack Class push() Method
The method inserts an item onto the top of the stack. It works the same as the method addElement(item) method of the Vector class. It passes a parameter item to be pushed into the stack.

Syntax: public E push(E item)  

Parameter: An item to be pushed onto the top of the stack.

Returns: The method returns the argument that we have passed as a parameter.

Stack Class pop() Method
The method removes an object at the top of the stack and returns the same object. It throws EmptyStackException if the stack is empty.

Syntax: public E pop() 

Returns: It returns an object that is at the top of the stack.
*/

import java.util.*;  
public class StackPushPopOperation 
{  
public static void main(String args[])   
{  
//creating an object of Stack class  
Stack <Integer> stk = new Stack<>();  
System.out.println("stack: " + stk);  
//pushing elements into the stack  
pushelmnt(stk, 20);  
pushelmnt(stk, 13);  
pushelmnt(stk, 89);  
pushelmnt(stk, 90);  
pushelmnt(stk, 11);  
pushelmnt(stk, 45);  
pushelmnt(stk, 18);  
//popping elements from the stack  
popelmnt(stk);  
popelmnt(stk);  
//throws exception if the stack is empty  
try   
{  
popelmnt(stk);  
}   
catch (EmptyStackException e)   
{  
System.out.println("empty stack");  
}  
}  
//performing push operation  
static void pushelmnt(Stack stk, int x)   
{  
//invoking push() method      
stk.push(new Integer(x));  
System.out.println("push -> " + x);  
//prints modified stack  
System.out.println("stack: " + stk);  
}  
//performing pop operation  
static void popelmnt(Stack stk)   
{  
System.out.print("pop -> ");  
//invoking pop() method   
Integer x = (Integer) stk.pop();  
System.out.println(x);  
//prints modified stack  
System.out.println("stack: " + stk);  
}  
}  

/*
Output:
stack: []
push -> 20
stack: [20]
push -> 13
stack: [20, 13]
push -> 89
stack: [20, 13, 89]
push -> 90
stack: [20, 13, 89, 90]
push -> 11
stack: [20, 13, 89, 90, 11]
push -> 45
stack: [20, 13, 89, 90, 11, 45]
push -> 18
pop -> 18
stack: [20, 13, 89, 90, 11, 45]
pop -> 45
stack: [20, 13, 89, 90, 11]
pop -> 11
stack: [20, 13, 89, 90]
PS C:\Users\lenovo\Desktop\java folder>
*/
