
public class LinkedList {
	private Link first;
	LinkedList()
	{
		first = null;
	}
	public boolean isEmpty()
	{
		return(first == null);
	}
	
	void insertFirst(int id, double dd)
	{
		Link link = new Link(id,dd);
		link.next = first;
		first = link;
	}
	
	public Link find(int key)
	{
		Link current = first;
		while(current.iData != key)
		{
			if(current.next == null)
				return null;
			else
				current = current.next;
		}

		return current;
	}
	
	public Link deleteFirst()
	{
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public Link delete(int key)
	{
		Link previous = first;
		Link current = first;
		while(current.iData != key)
		{
			if(current.next == null)
				return null;
			else
				previous = current;
				current = current.next;
		}
		if(current ==first)
			first = first.next;
		else
			previous.next = current.next;
		return current;
	}
	
	public void displayList()
	{
		System.out.print("list(F --> L)");
		Link current = first;
		while(current != null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
