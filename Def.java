package com.DayOne;

import java.util.LinkedList;

public class Def {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.addLast("C");
        linkedList.addFirst("D");
        linkedList.add("E");
        System.out.println(linkedList);

        linkedList.remove("B");
        linkedList.remove(3);
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);

    }
}
