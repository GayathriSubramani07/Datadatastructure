package com.demo;

class QueueOperation{
	int maxsize;
	int Queue[] ;
	int front;
	int rear;
	public QueueOperation(int maxsize) {
		super();
		this.maxsize = maxsize;
		Queue = new int[maxsize];
		front = 0;
		rear = -1;
	}
	public void EnQueue(int i) {
		if(rear ==maxsize-1)
		{
			System.out.println("Queue is FUll");
			return;
		}
		else
		{
			Queue[++rear]=i;
			System.out.println("Data inserted Successfully");
		}
	}
	public void display() {
		if (front > rear) {
			System.out.println("Queue is Empty");
			return ;
		}
		for(int i=front;i<=rear;i++) {
			System.out.print(Queue[i]+ " ");
		}
		System.out.println();
		
	}
	public void DeQueue() {
	if(front > rear) {
		System.out.println("Queue is Empty");
		return;
	}
	else
	{
		System.out.println(Queue[front++]+" Removed from Queue");
	}
		
	}
	public void peek() {
		if(front >rear) {
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("peek value in the Queue "+Queue[front]);
		}
		
	}
	



}
public class QueueInArray {
	public static void main(String[] args) {
		QueueOperation qo =new QueueOperation(10);
		qo.EnQueue(10);
		qo.EnQueue(20);
		qo.EnQueue(30);
		qo.display();
		qo.DeQueue();
		qo.peek();

	}

}
