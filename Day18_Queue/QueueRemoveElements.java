import java.util.*;

/*
Topic : Operations on Queue
2. Removing Elements: In order to remove an element from a queue, we can use the remove() method. 
If there are multiple such objects, then the first occurrence of the object is removed.
Apart from that, poll() method is also used to remove the head and return it. 
*/
public class QueueRemoveElements {
public static void main(String args[]){
    Queue<String> pq=new PriorityQueue<>();
    pq.add("CPP");
    pq.add("Python");
    pq.add("Java");

    System.out.println("Initital Queue"+pq);
    pq.remove("CPP");
    System.out.println("After Remove.."+pq);
    System.out.println("Poll Method"+pq.poll());
    System.out.println("Final Queue"+pq);

}  
}

/*Initital Queue[CPP, Python, Java]
After Remove..[Java, Python]
Poll MethodJava
Final Queue[Python]
PS C:\Users\lenovo\Desktop\java folder>  */
