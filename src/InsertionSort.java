
public class InsertionSort {
	private int[] array;
	public InsertionSort() {
		array = new int[5];
		array[0] = 8;
		array[1] = 7;
		array[2] = 6;
		array[3] = 5;
		array[4] = 4;
	}
	
	void sort()
	{
		int in ,out;
		for(out=1; out< array.length;out++)
		{
			int temp = array[out];
			in = out;
			while(in>0 && array[in-1]>= temp)
			{
				array[in] = array[in-1];
				--in;
			}
			array[in] = temp;
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
