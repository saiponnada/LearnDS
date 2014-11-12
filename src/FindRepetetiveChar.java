import java.util.HashMap;


public class FindRepetetiveChar {

	public FindRepetetiveChar() {
		// TODO Auto-generated constructor stub
		 
	}
	
	public void find() {
		String s = "tester";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i< s.length(); i++){
			char key = s.charAt(i);
			if(map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, value+1);
			}
			else {
				map.put(key, 1);
			}
			
		}
		for(int i=0; i< s.length(); i++){
			char key = s.charAt(i);
			if(map.get(key) == 1){
				System.out.println(key);
				break;
			}
		}
		
		/*for (String key : map.keySet()) {
		    System.out.println(key + "--" + map.get(key));
		}*/
			 
				
	}
	
	

}
