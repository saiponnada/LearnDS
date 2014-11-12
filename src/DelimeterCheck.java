public class DelimeterCheck {
	String expression;
	DelimeterCheck(String in)
	{
		expression = in;
		System.out.println(expression);
	}
	void checkExpression()
	{
		Stack st = new Stack(expression.length());
		for(int i =0; i<expression.length();i++)
		{
			char c = expression.charAt(i);
			switch(c){
			case '{':
			case '[':
			case '(':
				st.push(c);
				break;
			case '}':
			case ']':
			case ')':
				if(!st.isEmpty()){
					char ch = st.pop();
					if((c == '}' && ch != '{') ||
						(c == ']' && ch != '[') ||
						(c == ')' && ch != '('))
					System.out.println("Error " + c + "at" + i);
				} else
				{
					System.out.println("Error " + c + "at" + i);
				}
				
				break;
			default:
				break;
			}
		}
		if(!st.isEmpty())
			System.out.println("Error: Right delimeter is missing");
	}
}
