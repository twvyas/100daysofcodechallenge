/*
 Topic : Operations on Queue
 1. Adding Elements: In order to add an element in a queue,
  we can use the add() method. 
  The insertion order is not retained in the PriorityQueue. 
  The elements are stored based on the priority order which is ascending by default. 
*/

//Java
import java.util.*;
public class QueueAddElements {
    public static void main(String args[]){
        Queue<String> pq=new PriorityQueue<>();
        pq.add("Java");
        pq.add("CPP");
        pq.add("Python");
        pq.add("ReactJS");

        System.out.println(pq);

    }
}
