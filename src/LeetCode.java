
public class LeetCode {
	public int reverse(int x) {
        if(x==0)
        	return 0;
        int sum =0;
        while(x!=0){
        	sum = sum*10;
        	sum += x%10;
            x = x/10;
        }
        return sum;
        
    }
	
	public int atoi(String str) {
        if(str==null || str.isEmpty() || str == " ")
        	return 0;
        boolean isNegative = false;
        int index=0;
        double sum=0;
        str = str.trim();
        if(str.charAt(0) =='-')
        	isNegative = true;
        if(str.charAt(0) =='-' || str.charAt(0) =='+'){
        	index=1;
        }
       for(int i=index; i<str.length();i++){
    	   if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
        	   sum = sum*10;
        	   sum +=str.charAt(i) -'0';
    	   }
    	   else
    		   break;
       }
       if(isNegative)
    	   sum = 0-sum;
       if(sum >= Integer.MAX_VALUE)
    	   return Integer.MAX_VALUE;
       else if (sum<= Integer.MIN_VALUE)
    	   return Integer.MIN_VALUE;
       else
    	   return (int) sum;
    }
	
	public String countAndSay(int n) {
        /*
         * The count-and-say sequence is the sequence of integers beginning as follows:
			1, 11, 21, 1211, 111221, ...
			
			1 is read off as "one 1" or 11.
			11 is read off as "two 1s" or 21.
			21 is read off as "one 2, then one 1" or 1211.
			Given an integer n, generate the nth sequence.
			
			Note: The sequence of integers will be represented as a string.
         * */
		String oldString = null;
		String newString = "";
		if(n<=1)
			return "1";
		else if(n==2)
			return "11";
		else if (n>2){
			oldString = countAndSay(n-1);
			char prev = oldString.charAt(0);
			int prevCount =0;
			for(int i=0; i<oldString.length();i++){
				if(prev == oldString.charAt(i)){
					prevCount++;
				}
				else{
					newString += "" + prevCount + prev;
					prev = oldString.charAt(i);
					prevCount=1;
				}
			}
			newString += "" + prevCount + prev;
		}
		return newString;
    }
	
	public boolean isPalindrome(int x) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		if(x<0)
        	return false;
		
        int sum =0;
        int temp= x;
        while(x!=0){
        	sum = sum*10;
        	sum += x%10;
            x = x/10;
        }
        
        if(temp==sum)
        	return true;
        else
        	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode obj  = new LeetCode();
		System.out.println(obj.isPalindrome(-2147447412));
	}

}
