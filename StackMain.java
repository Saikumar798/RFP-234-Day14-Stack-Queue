package stackAndQueue;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(70);
		stack.push(30);
		stack.push(56);

		stack.peek();
		stack.pop();
		stack.peek();
		stack.pop();
		stack.peek();
		stack.pop();
		System.out.println(stack.isEmpty());

		
	}

}
