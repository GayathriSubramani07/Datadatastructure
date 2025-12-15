package com.demo;

import java.util.Stack;

class StackOperation {
	int maxsize;
	int stack[];
	int top;
	public StackOperation(int maxsize) {
		
		this.maxsize = maxsize;
		stack =new int[maxsize];
		top =-1;
	}
	public void push(int i) {
		if(top == maxsize -1)
		{
			System.out.println("Array is full");
			return;
		}
		else {
			stack[++top]=i;
			System.out.println(i +" is entered into the stack ");
		}
	}
	public void display() {
		if(top ==-1) {
			System.out.println("Stack is empty");
			return;
		}
		else {
			for(int i=top;i>=0;i--)
			{
				System.out.print(stack[i]+" ");
			}
			System.out.println();
			
		}
		
	}
	public void pop() {
		if(top == -1)
		{
			System.out.println("Stack is full");
			return;
		}
		else
		{
			System.out.println(stack[top--] +" is poped from stack");
		}
		
	}
	public void peek() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return;
		}
		else
		{
			System.out.println(stack[top] +" this is the peek element in array");
		}
	}
	
	
	
	
	
}

public class StackInArray {
	
	public static void main(String[] args) {
		
		StackOperation so=new StackOperation(10);
		so.push(10);
		so.push(20);
		so.push(30);
		so.push(40);
		so.push(50);
		so.display();
		so.pop();
		so.display();
		so.peek();
		
	}

}
