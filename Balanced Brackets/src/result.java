import java.util.Stack;

public class result {
	public static String isBalanced(String s) {
        Stack<Character> stack = new Stack();
        for(Character c: s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }
                 char popV = stack.pop();
                if(!((c == ')' && popV == '(') || (c == ']' && popV == '[') || (c == '}' && popV == '{'))){
                    return "NO";
                }
               
            }
        }
        return stack.isEmpty() ? "YES" : "NO";

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBalanced("[{"));
	}

}
