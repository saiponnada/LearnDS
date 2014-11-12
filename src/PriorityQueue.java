
public class PriorityQueue {
	private int[] arr;
	private int front;
	private int rear;
	private int maxSize;
	private int nItems;
	
	PriorityQueue(int max)
	{
		maxSize = max;
		arr = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	void insert(int num)
	{
		if(isEmpty())
			arr[rear++]= num;
		else
		{
			for(int index = front;index <= rear;index++)
			{
				int temp = arr[index];
				int in = index;
				while(in>0 && arr[in-1]>= temp)
				{
					arr[in] = arr[in-1];
					--in;
				}
				arr[in] = temp;
			}
		}
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
