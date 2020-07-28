package chapter10_exercise;


public class TheQueueClassQuestion10 {
	public static void main(String[] args) {
		Queue numQueue = new Queue();
		
		for(int i = 1;i <= 20;i++) {
			numQueue.enqueue(i);
		}
		
		while(!numQueue.empty()) {
			System.out.printf("%d ",numQueue.dequeue());
		}
		
	}
}

class Queue {
	private int[] element;
	private int size;
	public static final int DEFAULT_CAPACITY = 8;

	public Queue() {
		this.element = new int[DEFAULT_CAPACITY];
		this.size = 0;
	}

	public void enqueue(int v) {
		if (this.size % DEFAULT_CAPACITY == 0 && this.size > 0) {
			int[] temp = new int[this.size * 2];
			System.arraycopy(this.element, 0, temp, 0, this.size);
			this.element = temp;	
		}
		this.element[this.size++] = v;
	}

	public int dequeue() {
		int head = this.element[0];
		for (int i = 1; i < this.size; i++)
			this.element[i - 1] = this.element[i];
		this.size--;
		return head;
	}

	public boolean empty() {
		return (this.size == 0);
	}

	public int getSize() {
		return this.size;
	}

}
