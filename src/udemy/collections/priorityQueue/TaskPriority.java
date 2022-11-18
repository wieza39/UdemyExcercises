package udemy.collections.priorityQueue;

import java.util.PriorityQueue;

public class TaskPriority {
    public static void main(String[] args) {
        PriorityQueue<Tasks> queue = new PriorityQueue<>();

        queue.add(new Tasks(1, "one"));
        queue.add(new Tasks(5, "five"));
        queue.add(new Tasks(2, "two"));
        queue.add(new Tasks(4, "four"));
        queue.add(new Tasks(3, "three"));

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
