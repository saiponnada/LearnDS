import java.util.Scanner;


public class ReverseAWord {
	String word;
	String revWord = "";
	ReverseAWord()
	{
		System.out.println("Enter word to reverse");
		Scanner scan = new Scanner(System.in);
		word = scan.nextLine();
		scan.close();
	}
	
	void Reverse()
	{
		char[] arr = new char[word.length()]; //= word.toCharArray();
		for(int i =0; i<word.length();i++)
		{
			arr[i] = word.charAt(i);
		}
		for(int i = arr.length -1; i >-1; i--)
		{
			revWord = revWord + arr[i];
		}
		System.out.println(revWord);
	}
}
