
public class SelectionSort {
	private long[] array;
	public SelectionSort() {
		array = new long[5];
		array[0] = 8;
		array[1] = 7;
		array[2] = 6;
		array[3] = 5;
		array[4] = 4;
	}
	
	void sort()
	{
		
		for(int j =0; j<array.length; j++)
		{
			boolean sort = false;
			long key = array[j];
			int index = 0;
			//System.out.println(" " + key);
			for(int i =j; i<array.length; i++)
			{
				if(key > array[i])
				{
					key = array[i];
					index = i;
					sort = true;
				}
			}
			if(sort)
			{
				long temp = array[j];
				array[j] = array[index];
				array[index]= temp;
			}
			display();
		}
	}
	
	void display()
	{
		System.out.println("");
		for(int index = 0;index <= array.length-1;index++)
		{
			System.out.print(" " +array[index]);
		}
	}
}
