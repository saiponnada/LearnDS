import java.util.Scanner;
public class RemoveVowels {
	
	public String remove(String input) {
		if(input==null || input== " ") {
			return null;
		}
			
		else {
			StringBuilder sb = new StringBuilder();
			char[] ch = input.toLowerCase().toCharArray();
			for(int i=0; i<ch.length;i++) {
				if(ch[i]!= 'a' && ch[i]!= 'e' && ch[i]!= 'i' && ch[i]!= 'o' && ch[i]!= 'u')
					sb.append(ch[i]);
			}
			return sb.toString();
		}
	}
	public static void main(String[] args) {
		RemoveVowels obj = new RemoveVowels();
		System.out.println(obj.remove(null));
	}

}


/*switch(ch[i]) {
case 'a':
	continue;
case 'e':
	continue;
case 'i':
	continue;
case 'o':
	continue;
case 'u':
	continue;
default:
	sb.append(ch[i]);
}*/
