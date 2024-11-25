package com.sunbeam.stack;

import java.util.Scanner;

public class StackDescImpl {

	public static void main(String[] args) {


StackDesc st = new StackDesc(4);

int choice;
Scanner sc = new Scanner(System.in);

do {
	System.out.println("1. Push\n2. Pop\n3. Peek");
	System.out.print("Enter your choice : ");
	choice = sc.nextInt();
	
	switch(choice) {
	case 1:
		if(st.isFull())
			System.out.println("Stack is full");
		else {
			System.out.print("Enter data to be inserted : ");
			int data = sc.nextInt();
			st.push(data);
		}
		break;
	case 2:
		if(st.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Poped Data : " + st.pop());
		break;
	case 3:
		if(st.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Peeked Data : " + st.peek());
		break;
	}
	
}while(choice != 0);


sc.close();

}
}
