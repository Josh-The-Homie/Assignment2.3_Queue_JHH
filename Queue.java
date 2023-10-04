/**
 * @author Joshua
 * @param <T>
 */

public class Queue<T> {
    LinkedList<T> queueList = new LinkedList<T>();

    /**
     * Adds a new entry to the back of this queue.
     *
     * @param newEntry An object to be added.
     */
    public void enqueue(T newEntry) {
        Node<T> newNode = new Node<T>();
        newNode.setData(newEntry);
        queueList.addNode(newNode);
    }//end enqueue

    /**
     * Removes and returns the entry at the front of this queue.
     *
     * @return The object at the front of the queue.
     * @throws EmptyQueueException if the queue is empty before the operation.
     */
    public void dequeue() {
        queueList.removeNode(); // Implement removeNode in your LinkedList class
    }//end dequeue

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return queueList.isEmpty();
    }//end isEmpty

    /**
     * Removes all entries from this queue.
     */
    public void clear() {
        queueList = new LinkedList<T>(); // Reinitialize the linked list to clear all entries
    }//end clear
    /**
     * Prints the current Queue
     */
    public void printQueue() {
        Node<T> current = queueList.getList();
        System.out.print("Queue: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.nextNode;
        }

        System.out.println(); // Print a new line after the queue is printed
    }//end printQueue
    
}
