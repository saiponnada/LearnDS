
public class BubbleSort {
	private long[] array;
	public BubbleSort() {
		array = new long[5];
		array[0] = 1;
		array[1] = 6;
		array[2] = 2;
		array[3] = 4;
		array[4] = 8;
	}
	
	void sort()
	{
		for(int loop = 0; loop < array.length-1 ; loop++)
		{
			boolean swap = false;
			System.out.println(loop);
			for(int i =0; i<array.length-1; i++)
			{
				if(array[i] >array[i +1])
				{
					long temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					swap = true;
				}
				display();
			}
			if(!swap) break;
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
