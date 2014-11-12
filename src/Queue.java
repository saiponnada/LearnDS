
public class Queue {
	private int[] arr;
	private int front;
	private int rear;
	private int maxSize;
	private int nItems;
	
	Queue(int max)
	{
		maxSize = max;
		arr = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	void insert(int num)
	{
		if(rear == maxSize-1)
			rear = -1;
		arr[++rear] = num;
		nItems++;
	}
	
	int remove()
	{
		int temp = arr[front++];
		if(front == maxSize)
			front = 0;
		nItems--;
		return temp; 
		
	}
	
	boolean isEmpty()
	{
		if(nItems ==0)
			return true;
		else
			return false;
	}
	
	void display()
	{
		System.out.println("");
		for(int index = front;index <= rear;index++)
		{
			System.out.print(" " +arr[index]);
		}
	}
}
