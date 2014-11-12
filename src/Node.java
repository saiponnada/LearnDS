
public class Node {
	public int idata;
	public Node leftNode;
	public Node rightNode;
	Node(int id){
		idata = id;
	}
	public void displayNode(){
		System.out.println('{');
		System.out.println(idata);
		System.out.println('}');
	}
}
