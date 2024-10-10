import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(2);

       
        System.out.println("Priority Queue: " + priorityQueue);

        
        System.out.println("Poll (remove) the highest priority element: " + priorityQueue.poll());

        System.out.println("Priority Queue after polling: " + priorityQueue);

        
        System.out.println("Peek at the highest priority element: " + priorityQueue.peek());

       
        System.out.println("Polling all elements:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
