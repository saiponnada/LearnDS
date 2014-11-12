
public class RightRotations {

	public boolean rotations(String str1, String str2) {
		if(str1== null || str2 ==null || str1 == " " || str2 == " ")
			return false;
		else if(str1.length()!= str2.length())
			return false;
		else {
			String total = str1 + str1;
			if(total.contains(str2))
				return true;
			else
				return false;
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightRotations obj = new RightRotations();
		System.out.println(obj.rotations("plesam","mplesa")); 
	}

}
