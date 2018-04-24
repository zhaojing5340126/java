package onechapter;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Stack<String> ops=new Stack<String>();
		Stack<Double> value=new Stack<Double>();
		while(in.hasNext()) {
			String s=new String(in.next());
			switch (s) {
			case "(":
				break;
			case "+":
				ops.push(s);
				break;
			case "-":
				ops.push(s);
				break;
			case "*":
				ops.push(s);
				break;
			case "/" :
				ops.push(s);
				break;
			case "sqrt":
				ops.push(s);
				break;
			case ")":
				String op=ops.pop();
				double v=value.pop();
				if(op.equals("+")) {
					v=value.pop()+v;
				}else if(op.equals("-")) {
					v=value.pop()-v;
				}else if(op.equals("*")) {
					v=value.pop()*v;
				}else if(op.equals("/")) {
					v=value.pop()/v;
				}else if(op.equals("sqrt")) {
					v=Math.sqrt(v);
				}
				value.push(v);
				break;
			default:
				value.push(Double.parseDouble(s));
				break;
			}
		}
		System.out.println(value.pop());
		in.close();
	}

}
