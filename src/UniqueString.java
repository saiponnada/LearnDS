import java.util.HashMap;
public class UniqueString {
	
	public boolean CheckIfUniqueMap(String s) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		if(s != null && s!= "") {
			for(int i=0; i<s.length(); i++) {
				char key = s.charAt(i);
				if(map.containsKey(key)) {
					return false;
				}
				else {
					map.put(key, 1);
				}
			}
			return true;
		}
		else
			return false;
	}
	
	public boolean CheckIfUniqueArray(String s) {
		if(s==null || s=="") 
			return false;
		if(s.length() > 256)
			return false;
		boolean arr[] = new boolean[256];
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(!arr[(int)ch])
				arr[(int)ch] = true;
			else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		UniqueString obj = new UniqueString();
		boolean check = obj.CheckIfUniqueArray("solution");
		System.out.println(check);
	}

}
