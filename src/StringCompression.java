
public class StringCompression {
	
	public int getCompression(String s) {
		int size=0;
		char last = s.charAt(0);
		int count = 1;
		for(int i =1; i<s.length(); i++) {
			if(s.charAt(i) == last) {
				count++;
			} // repeat char
			else {
				size = size + 1 + String.valueOf(count).length();
				last = s.charAt(i);
				count = 1;
			}
			
		}
		size = size + 1+ String.valueOf(count).length();
		return size;
	}
	
	public String getCompressedString(String s) {
		if(s!= null && !s.isEmpty()) {
			int size = getCompression(s);
			//System.out.println(size);
			if(size>= s.length())
				return s;
			StringBuffer buffer = new StringBuffer();
			char last = s.charAt(0);
			int count = 1;
			for(int i =1; i<s.length(); i++) {
				if(s.charAt(i) == last) {
					count++;
				} // repeat char
				else {
					buffer.append(last);
					buffer.append(String.valueOf(count));
					last = s.charAt(i);
					count = 1;
				}
				
			}
			buffer.append(last);
			buffer.append(String.valueOf(count));
			return buffer.toString();
		}
		return "Enter valid string";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompression obj = new StringCompression();
		System.out.println(obj.getCompressedString("aaabbbcccccdddeeeeff"));
	}

}
