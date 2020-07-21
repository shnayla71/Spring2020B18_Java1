package Saim_Class;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collection_practices {

    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue<>();
        q.add("a");
        q.add("b");
        q.add("c");
        q.offer("java");
        System.out.println(q);
        System.out.println("=================");
        q.add("e");
        System.out.println(q.peek());//
        System.out.println("================");
        q.remove();
        System.out.println(q);
        System.out.println("=================");
        q.poll();
        System.out.println(q);
        System.out.println("==================");
        System.out.println(new PriorityQueue<>().peek());
    }
}
