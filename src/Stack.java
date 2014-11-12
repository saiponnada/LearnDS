
public class Stack {
	public char[] arr;
	int index =-1;
	Stack(int length)
	{
		arr = new char[length];
	}
	
	void push(char c)
	{
		arr[++index] = c;
	}
	
	char pop()
	{
		return arr[index--];
	}
	
	char peek()
	{
		return arr[index];
	}
	
	boolean isEmpty()
	{
		return (index ==-1);
	}
	
	void display()
	{
		System.out.println("");
		for(int index = 0;index <= arr.length-1;index++)
		{
			System.out.print(" " +arr[index]);
		}
	}
}
