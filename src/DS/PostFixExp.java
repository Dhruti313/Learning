package DS;

import java.util.Stack;

public class PostFixExp {
    public static int expression(String s){
        Stack <Integer> stack = new Stack<>();
        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i) >='0' && s.charAt(i)<= '9'){
                stack.push(s.charAt(i) - '0');
            }
            else{
                int a1 = stack.pop();
                int a2 = stack.pop();

                switch (s.charAt(i)){
                    case '+':
                        stack.push(a2+a1);
                        break;
                    case '-':
                        stack.push(a2-a1);
                        break;
                    case '*':
                        stack.push(a2 *a1);
                        break;
                    case '/':
                        stack.push(a2/a1);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String args[]){
        String s = "231*+9-";
        System.out.println(expression(s));
    }
}
