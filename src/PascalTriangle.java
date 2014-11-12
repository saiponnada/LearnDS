import java.util.List;
import java.util.ArrayList;;
public class PascalTriangle {
	public List<Integer> getRow(int rowIndex) {
	       List<Integer> mainList;
	        if(rowIndex <1){
	            mainList = new ArrayList();
	            mainList.add(1);
	            return mainList;
	        }
	        mainList = new ArrayList();
	        mainList.add(1);
	        mainList.add(1);
	        List<Integer> prevList = new ArrayList();
	        prevList = mainList;
	        for(int i=1; i<rowIndex;i++){
	            if(rowIndex >1){
	                mainList = new ArrayList();
	                mainList.add(1);
	                for(int j=0;j<i;j++){
	                    mainList.add(prevList.get(j)+prevList.get(j+1));
	                }
	                mainList.add(1);
	                prevList = mainList;
	            }
	        }
	        return mainList;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTriangle obj = new PascalTriangle();
		obj.getRow(3);
	}

}
