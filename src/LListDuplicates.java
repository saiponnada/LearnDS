public class LListDuplicates {
	SLink first = null;
	SLink last = null;
	public boolean isEmpty(){
		if(first==null)
			return true;
		else
			return false;
	}
	public void insertLink(char c){
		SLink link = new SLink(c);
		if(isEmpty()) {
			last = link;
			first = last;
		}
		else {
			last.next = link;
			last = link;
		}
	}
	
	public void displayList(){
		SLink current = first;
		while(current != null){
			System.out.println(current.c);
			current = current.next;
		}
	}
	public boolean find(char key){
		SLink current = first;
		if(current ==null)
			return false;
		while(current.c != key)
		{
			if(current.next == null)
				return false;
			else
				current = current.next;
		}
		return true;
	}
	public void removeDuplicates(LListDuplicates obj1){
		SLink current = first;
		while(current != null){
			if(!obj1.find(current.c)){
				obj1.insertLink(current.c);	
			}
			current = current.next;
		}
	}
	
	public void insertWODuplicates(char ch){
		if(!find(ch)){
			insertLink(ch);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LL Implementation");
		LListDuplicates obj = new LListDuplicates();
		obj.insertLink('F');
		obj.insertLink('O');
		obj.insertLink('L');
		obj.insertLink('L');
		obj.insertLink('O');
		obj.insertLink('W');
		obj.insertLink(' ');
		obj.insertLink('U');
		obj.insertLink('P');
		obj.displayList();
		//System.out.println("-----------------------");
		//LListDuplicates obj1 = new LListDuplicates();
		//obj.removeDuplicates(obj1);
		//obj1.displayList();
	}

}
