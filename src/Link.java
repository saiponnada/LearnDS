
public class Link {
	public int iData;
	public double dData;
	public Link next;
	Link(int id, double dd)
	{
		iData = id;
		dData = dd;
	}
	
	public void displayLink()
	{
		System.out.print("{" +iData+ ","+ dData +"}");
	}
}
