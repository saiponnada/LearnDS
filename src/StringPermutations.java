import java.util.Arrays;


public class StringPermutations {
	public boolean checkPermutations(String s, String t) {
		if(s==null || t==null || s =="" || t=="")
			return false;
		if(s.length() != t.length())
			return false;
		if(sort(s).equals(sort(t)))
			return true;
		else
			return false;
	}
	public String sort(String str) {
		char[] strArray =str.toCharArray();
		Arrays.sort(strArray);
		return new String(strArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPermutations obj = new StringPermutations();
		boolean check = obj.checkPermutations("", "");
		System.out.println(check);
	}

}
