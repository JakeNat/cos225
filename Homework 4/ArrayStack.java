
public class ArrayStack<T> implements Stack<T> {
	private T values[];
	private int size = 0;
	private int capacity = 100;
	
	public ArrayStack(){
		values = (T[]) new Object[capacity];
	}
	
	public ArrayStack(int cap){
		values = (T[]) new Object[cap];
		capacity = cap;
	}
	
	@Override
	public void push(T element) {
		if (size < capacity){
			values[size] = element;
			size++;
		}
		else{
			resize();
			values[size] = element;
			size++;	
		}
	}
	
	@Override
	public String toString(){
		String out = "";
		for (int i = 0; i < size; i++){
			out += values[i].toString() + " ";
		}
		return out;
	}

	@Override
	public T pop() {
		size--;
		return values[size];
	}

	@Override
	public T peek() {
		return values[size];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}
	
	public void resize(){
		capacity *= 2;
		T[] newArray = (T[]) new Object[capacity];
		for (int i = 0; i < size; i++){
			newArray[i] = values[i];
		}
		values = newArray;
	}
}