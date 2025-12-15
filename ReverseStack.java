package com.demo;

import java.util.Stack;

public class ReverseStack {
	
	public static void main(String[] args) {
		Stack<Integer> stack =new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Original Stack " + stack);
		
		Stack<Integer> reverseStack = ReverStack(stack);
		
		System.out.println("Reversed Stack " + reverseStack);
	}

	private static Stack<Integer> ReverStack(Stack<Integer> stack) {
		Stack<Integer> temp=new Stack<Integer>();
		while(!stack.isEmpty())
		{
			temp.push(stack.pop());
		}
		return temp;
	}

}
