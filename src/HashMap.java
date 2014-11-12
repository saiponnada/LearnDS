
public class HashMap {
	
	private int arraySize;
	private HashItem[] hashArray;
	private HashItem noItem;
	
	public HashMap(int size){
		arraySize= size;
		hashArray = new HashItem[arraySize];
		noItem = new HashItem(-1); // for deleted items
	}
	
	public void displayTable(){
		System.out.println("Table:");
		for(int i=0; i<arraySize; i++){
			if(hashArray[i] != null)
				System.out.println(hashArray[i].getKey());
			else
				System.out.println("***");
		}
		System.out.println("");
	}
	
	public int hashFunc(int key){
		return key % arraySize;
	}
	
	public void insert(HashItem item){
		int key = item.getKey();
		int hashValue = hashFunc(key);
		while(hashArray[hashValue] != null && hashArray[hashValue].getKey() != -1){
			++hashValue;
			//wrapping can be added
		}
		hashArray[hashValue] = item;
	}
	
	public HashItem delete(int key){
		int hashValue = hashFunc(key);
		while(hashArray[hashValue] != null){
			if(hashArray[hashValue].getKey() == key){
				HashItem temp = hashArray[hashValue];
				hashArray[hashValue] = noItem;
				return temp;
			}
			++hashValue;
			//wrapping can be added
		}
		return null;
	}

	public static void main(String[] args) {
		HashMap obj = new HashMap(60);
		obj.displayTable();
	}
}
