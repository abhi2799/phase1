package stackop;

public class Stack {
	static final int MAX = 4;
	int top;
	int a[] = new int[MAX];
	boolean isEmpty() {
		return(top<0);
	}
	Stack() {
		top = -1;
	}
	boolean push(int x) {
		if (top>= (MAX -1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x + " is pushed into stack");
			return true;
		}
	}
	int pop() { 
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	int peek() {
		if (top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x= a[top];
			return x;
		}
	}
void print() {
	for (int i = top; i>-1 ; i-- ) {
		System.out.println(" " + a[i]);
	}
 }
  
public static void main (String args[]) {
	Stack s =new Stack();
	s.pop();
	s.peek();
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.push(50);
	System.out.println(s.pop() +"poped from stack");
	System.out.println("top element is:" + s.peek());
	System.out.println("Elements present in stack:");
	s.print();
}
}