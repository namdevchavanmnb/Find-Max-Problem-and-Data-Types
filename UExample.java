package com.DayOne;

import java.util.LinkedList;
import java.util.Queue;

public class UExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("banana");
        queue.add("cherry");

        System.out.println("Queue"+queue);
        String front = queue.remove();
        System.out.println("Remove element: " +front);
        System.out.println("Queue after removel :" +queue);
        queue.add("date");
        String peeked = queue.peek();
        System.out.println("Peeked element:"+peeked);

        System.out.println("Queue after peek:"+queue);

    }
}
