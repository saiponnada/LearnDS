
public class SpaceReplacement {
	public String ReplaceSpaces(String s, int len) {
		if(s==null || s=="")
			return "Enter proper values";
		char[] arr = s.toCharArray();
		/*
		StringBuilder build = new StringBuilder();
		for(int i =0; i<len;i++) {
			if(arr[i]==' ')
				build.append("%20");
			else
				build.append(arr[i]);
		}
		return build.toString();
		*/
		int space= 0;
		for(int i =0; i<len;i++) {
			if(arr[i]==' ') {
				space++;
			}
		}
		int newLen = len+ space*2;
		for(int i =len-1; i>=0;i--) {
			if(arr[i]!=' ') {
				arr[newLen -1] = arr[i];
				newLen--;
			}
			else {
				arr[i] = '%';
				arr[i+1]= '2';
				arr[i+2] = '0';
				newLen = newLen-3;
			}
		}
		s = String.valueOf(arr);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpaceReplacement obj = new SpaceReplacement();
		System.out.println(obj.ReplaceSpaces("Sai Goutham  ", 11));
	}

}
