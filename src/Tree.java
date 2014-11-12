
public class Tree {
	private Node root;
	Tree(){
		root = null;
	}
	public void insert(int id){
		Node newNode = new Node(id);
		if(root==null)
			root = newNode;
		else {
			Node current = root;
			Node parent;
			while(true){
				parent= current;
				if(id< current.idata){
					current = current.leftNode;
					if(current ==null){
						parent.leftNode = newNode;
						return;
					}
				}
				else{
					current = current.rightNode;
					if(current==null){
						parent.rightNode=newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node find(int key){
		Node current = root;
		while(true){
			if(current.idata==key)
				return current;
			if(current.idata < key){
				current = current.rightNode;
			}
			else {
				current = current.leftNode;
			}
			if(current==null)
				return null;
		}
	}
	
	public boolean delete(int key){
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		while(current.idata!=key){
			parent = current;
			if(current.idata < key){
				isLeftChild = false;
				current = current.rightNode;
			}
			else {
				isLeftChild = true;
				current = current.leftNode;
			}
			if(current==null)
				return false;
		} //find node
		
		if(current.leftNode == null && current.rightNode == null){
			if(current == root)
				root = null;
			else if(isLeftChild)
				parent.leftNode = null;
			else
				parent.rightNode = null;
		} // check to know if its leaf node and making it null
		else if(current.rightNode ==null){
			if(current ==root)
				root = current.leftNode;
			else if(isLeftChild)
				parent.leftNode = current.leftNode;
			else
				parent.rightNode = current.leftNode;
		}
		else if(current.leftNode==null){
			if(current ==root)
				root = current.rightNode;
			else if(isLeftChild)
				parent.leftNode = current.rightNode;
			else
				parent.rightNode = current.rightNode;
		}
		else {
			// yet to implement
		}
		return true;
	}
	
	public void preorderTraversal(Node localRoot){
		if(localRoot!=null){
			System.out.print(localRoot.idata+ " ");
			preorderTraversal(localRoot.leftNode);
			preorderTraversal(localRoot.rightNode);
		}
	}
	public void inorderTraversal(Node localRoot){
		if(localRoot!=null){
			inorderTraversal(localRoot.leftNode);
			System.out.print(localRoot.idata+ " ");
			inorderTraversal(localRoot.rightNode);
		}
	}
	public void postorderTraversal(Node localRoot){
		if(localRoot!=null){
			postorderTraversal(localRoot.leftNode);
			postorderTraversal(localRoot.rightNode);
			System.out.print(localRoot.idata+ " ");
		}
	}
	public void traversal(){
		System.out.println("---Pre Order----");
		preorderTraversal(root);
		System.out.println(" ");
		System.out.println("---In Order----");
		inorderTraversal(root);
		System.out.println(" ");
		System.out.println("---post Order----");
		postorderTraversal(root);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree obj = new Tree();
		obj.insert(50);
		obj.insert(25);
		obj.insert(75);
		obj.insert(1);
		obj.insert(12);
		obj.insert(62);
		obj.insert(100);
		obj.traversal();
		System.out.println(obj.delete(12));
		System.out.println(obj.delete(100));
		System.out.println(obj.delete(75));
		obj.traversal();
	}

}
