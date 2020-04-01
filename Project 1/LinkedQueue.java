public class LinkedQueue<T> implements Queue<T>{
	private LinkedNode<T> head;
	private LinkedNode<T> tail;
	private int size = 0;


	@Override
	public void enqueue(T element) {						//O(1)
		LinkedNode<T> newNode = new LinkedNode<T>(element);
		if (!isEmpty()) {
			tail.setNext(newNode);
			tail = tail.getNext();
		}
		else {
			head = newNode;
			tail = newNode;
		}
		size++;
	}

	@Override
	public T dequeue() {									//O(1)
		if (!isEmpty()) {
			LinkedNode<T> returnedNode = head;
			head = head.getNext();
			size--;
			if (isEmpty()) {
				tail = null;
			}
			return returnedNode.getElement();
		}
		else {
			return null;
		}
	}

	@Override
	public T getFront() {									//O(1)
		return head.getElement();
	}

	@Override
	public boolean isEmpty() {								//O(1)
		return head == null;
	}

	@Override
	public int size() {										//O(1)
		return size;
	}
}