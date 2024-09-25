import java.util.LinkedList;

public class LinkedListTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of LinkedList
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            System.out.println("\nLinkedList Operations - Size: " + size);

            // 1. Read by index (O(n))
            long startTime = System.nanoTime();
            int value = linkedList.get(size / 2);
            long endTime = System.nanoTime();
            System.out.println("Read by index: " + (endTime - startTime) + " ns");

            // 2. Read by value (O(n))
            startTime = System.nanoTime();
            boolean found = linkedList.contains(size - 1);
            endTime = System.nanoTime();
            System.out.println("Read by value: " + (endTime - startTime) + " ns");

            // 3. Insert at head (O(1))
            startTime = System.nanoTime();
            linkedList.addFirst(-1);
            endTime = System.nanoTime();
            System.out.println("Insert at head: " + (endTime - startTime) + " ns");

            // 4. Insert at mid (O(n))
            startTime = System.nanoTime();
            linkedList.add(size / 2, -1);
            endTime = System.nanoTime();
            System.out.println("Insert at mid: " + (endTime - startTime) + " ns");

            // 5. Insert at tail (O(1))
            startTime = System.nanoTime();
            linkedList.addLast(-1);
            endTime = System.nanoTime();
            System.out.println("Insert at tail: " + (endTime - startTime) + " ns");

            // 6. Delete from head (O(1))
            startTime = System.nanoTime();
            linkedList.removeFirst();
            endTime = System.nanoTime();
            System.out.println("Delete from head: " + (endTime - startTime) + " ns");

            // 7. Delete from mid (O(n))
            startTime = System.nanoTime();
            linkedList.remove(size / 2);
            endTime = System.nanoTime();
            System.out.println("Delete from mid: " + (endTime - startTime) + " ns");

            // 8. Delete from tail (O(1))
            startTime = System.nanoTime();
            linkedList.removeLast();
            endTime = System.nanoTime();
            System.out.println("Delete from tail: " + (endTime - startTime) + " ns");
        }
    }
}

