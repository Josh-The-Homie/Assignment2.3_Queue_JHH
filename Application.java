/**
 * @author Joshua Henderson
 * @param <T>
 */
public class Application<T> {
    public static void main(String[] args) {
        Queue<String> queueList = new Queue<String>();

        queueList.enqueue("Bill");
        queueList.enqueue("Alice");
        queueList.enqueue("Bob");
//dequeue Bill
        queueList.dequeue();
        queueList.enqueue("Jane");
        queueList.enqueue("Hamad");
//dequeue Alice and Bob
        queueList.dequeue();
        queueList.dequeue();

        queueList.enqueue("Jim");
//dequeue Jane and Hamad
        queueList.dequeue();
        queueList.dequeue();

        queueList.printQueue();
    }
}