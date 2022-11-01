/*
 Topic : Queue
 >Queue interface is present in java.util package
 >Being an interface the queue needs a concrete class for the declaration and the most common classes are the PriorityQueue and LinkedList in Java.
 >Syntax:
 */

import java.util.LinkedList;
import java.util.Queue;
public class queuexample {
    public static void main(String args[]){
        Queue<Integer> q1=new LinkedList<>();
        //add elememts to queue
        for(int i=0;i<5;i++)
            q1.add(i);

        //display contents of the queue
        System.out.println("Elements of the queue.."+q1);

        //remove the head of the queue
        int removeele=q1.remove();
        System.out.println("remove element "+removeele);
        //display queue after removal of head element
        System.out.println(q1);

        //to view the queue
        int head=q1.peek();
        System.out.println("head of the queue "+head);
        
        //size of queue
        int size=q1.size();
        System.out.println("Size of queue "+size);   
    }
    }

    /*Output:
Elements of the queue..[0, 1, 2, 3, 4]
remove element 0
[1, 2, 3, 4]
head of the queue 1
Size of queue 4
PS C:\Users\lenovo\Desktop\java folder> 
    */
    

