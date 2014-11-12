
public class Array {
	private long[] array;
	private int index =0;
	private int chkDup =1;
	private boolean flag = false;
	Array()
	{
		array = new long[20];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		array[6] = 7;
		array[7] = 8;
		array[8] = 9;
		array[9] = 10;
		array[10] = 11;
		array[11] = 12;
		array[12] = 13;
		array[13] = 14;
		array[14] = 15;
		array[15] = 16;
		array[16] = 17;
		array[17] = 18;
		array[18] = 19;
		array[19] = 20;
		System.out.println("Array: ");
		for(index = 0;index <= array.length-1;index++)
		{
			System.out.print(" " +array[index]);
		}
	}
	void setElement(int index, long num)
	{
		array[index] = num;
	}
	long getElement(int index)
	{
		return array[index];
	}
	int insert(long num)
	{
		if(num ==0)
		{
			System.out.println("\nZero cannot be inserted. Please enter another value");
			return 1;
		}
		if(chkDup ==1)
		{
			for(index = 0;index <= array.length-1;index++)
			{
				if (getElement(index) == num) {
					System.out.println("\nnumber found at " + index + " position. Cannot insert Duplicates");
					return 1;
				}
				else if(getElement(index)==0)
				{
					setElement(index, num);
					System.out.println("\n" + num +"is inserted at position " + index);
					display();
					return 0;
				}
			}
		}
		return 1;
	}
	
	void search(long num)
	{
		for(index = 0;index <= array.length-1;index++)
		{
			if (getElement(index)== num) {
				flag=true;
				System.out.println("\nnumber found at " + index + " position.");
				break;
			}
		}
		if(flag!=true)
		System.out.println("\nNumber not found in array");
	}
	
	void delete(long num)
	{
		search(num);
		if(flag==true)
		{
			while(getElement(index)!=0)
			{
				//array[index] = array[index +1];
				setElement(index, getElement(index +1));
				index++;
			}
			display();
		}
	}
	
	void display()
	{
		System.out.println("Array: ");
		for(index = 0;index <= array.length-1;index++)
		{
			System.out.print(" " +array[index]);
		}
	}
	
	int binarySearch(long num)
	{
		return binarySearch(num,0, array.length -1);
	}
	int binarySearch(long num,int low, int high)
	{
		if(low>high) return -1;
		int mid = (low+high)/2;
		if(getElement(mid) == num)
		{
			System.out.println("\nElement found at " + mid + " position");
			return mid;
		}
		else if(getElement(mid) > num)
			return binarySearch(num, low,mid-1);
		else
			return binarySearch(num, mid +1,high);
	}
}
