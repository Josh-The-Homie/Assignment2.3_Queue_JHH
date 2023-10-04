/**
 * @author njohnson3
 * edited by Joshua Henderson
 *
 */
public class LinkedList<T> {
	
	Node<T> head;
	int length;
	Node<T> tail;
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	public Node<T> getList()
	{
		return head;
	}
	public void addNode(Node<T> aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}
	public void removeNode() {
	    if (isEmpty()) {
	        // The list is empty, nothing to remove
	        return;
	    }

	    // Move the head reference to the next node, effectively removing the first node
	    head = head.nextNode;

	    // Update the tail reference if the list is now empty
	    if (head == null) {
	        tail = null;
	    }
	}
	}


