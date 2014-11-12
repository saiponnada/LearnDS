class StackX {
	private final int MAX_SIZE =20;
	private int[] st;
	private int top;
	
	public StackX(){
		st = new int[MAX_SIZE];
		top = -1;
	}
	public void push(int j){
		st[++top] =j;
	}
	public int pop(){
		return st[top--];
	}
	public int peek(){
		return st[top];
	}
	public boolean isEmpty(){
		return(top==-1);
	}
}

class QueueX{
	private final int MAX_SIZE = 20;
	private int[] que;
	private int first;
	private int last;
	private int noItems;
	
	public QueueX(){
		que = new int[MAX_SIZE];
		first= 0;
		last = -1;
		noItems = 0;
	}
	
	public void add(int j){
		if(last == MAX_SIZE-1)
			last = -1;
		que[++last] =j;
		noItems++;
	}
	public int delete(){
		int temp = que[first++];
		noItems--;
		if(first == MAX_SIZE)
			first = 0;
		return temp;
	}
	public int peek(){
		return que[first];
	}
	public boolean isEmpty(){
		return(noItems==0);
	}
}

class Vertex{
	public char label;
	public boolean isVisited;
	public Vertex(char lab){
		label = lab;
		isVisited = false;
	}//constructor end
}// class end

class Graph{
	private final int MAX_VERTS = 20;
	private Vertex[] vertexList;
	private int[][] adjMatrix;
	private StackX stack;
	private QueueX que;
	private int nVerts;
	
	public Graph(){
		vertexList = new Vertex[MAX_VERTS];
		adjMatrix = new int[MAX_VERTS][MAX_VERTS];
		//stack = new StackX();
		que = new QueueX();
		nVerts =0;
		for(int i=0;i<MAX_VERTS;i++)
			for(int j=0;j<MAX_VERTS;j++)
				adjMatrix[i][j]=0;
	}//end constructor
	
	public void addVertex(char label){
		vertexList[nVerts++] =new Vertex(label);
	}
	public void addEdge(int start,int end){
		adjMatrix[start][end]=1;
		adjMatrix[end][start]=1;
	}
	public void displayVertex(int v){
		System.out.println(vertexList[v].label);
	}
	public void dfs(){
		vertexList[0].isVisited = true;
		displayVertex(0);
		stack.push(0);
		
		while(!stack.isEmpty()){
			int v = getAdjacentMatrix(stack.peek());
			if(v==-1)
				stack.pop();
			else {
				vertexList[v].isVisited = true;
				displayVertex(v);
				stack.push(v);
			}
		}//end while
		for(int j=0;j<nVerts;j++){
			vertexList[0].isVisited = false;
		}
		
	}
	
	public void bfs(){
		vertexList[0].isVisited = true;
		displayVertex(0);
		que.add(0);
		int v1;
		while(!que.isEmpty()){
			int v = que.delete();
			while((v1= getAdjacentMatrix(v))!=-1 ){
				vertexList[v1].isVisited = true;
				displayVertex(v1);
				que.add(v1);
			}
		}//end while
		for(int j=0;j<nVerts;j++){
			vertexList[0].isVisited = false;
		}
	}
	
	public int getAdjacentMatrix(int v){
		for(int i =0 ; i<MAX_VERTS; i++){
			if(adjMatrix[v][i] ==1 && vertexList[i].isVisited ==false)
				return i;
		}
		return -1;
	}
}// end class Graph

public class GraphsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph obj = new Graph();
		obj.addVertex('A');
		obj.addVertex('B');
		obj.addVertex('C');
		obj.addVertex('D');
		obj.addVertex('E');
		obj.addEdge(0, 1);
		obj.addEdge(1, 2);
		obj.addEdge(0, 3);
		obj.addEdge(3, 4);
		
		//obj.dfs();
		obj.bfs();
	}

}
