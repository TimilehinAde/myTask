package com.timmy.dataCollections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("james", 54));
        linkedList.add((new Person("amake", 21)));
        linkedList.addLast(new Person("timi", 2));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("alex", 21));
        supermarket.add(new Person("joel", 17));
        supermarket.add(new Person("skrill", 45));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.isEmpty());

        System.out.println(supermarket.element());
    }

    static record Person(String name, int age){}
}
