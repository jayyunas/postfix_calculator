/**
 * 
 */
public class Stack{
	static final int MAX = 1000; 
    int top; 
	int numStack[] = new int[MAX];
	
	public int size(){
		return(top + 1);
	}
	public long peek(){
		return numStack[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	public void push(int input){
		if (size() == numStack.length){
			throw new IllegalStateException("Stack is full");
		}
		numStack[++top] = input;
	}
		
	public int pop(){
		if (isEmpty()){
			throw new IllegalStateException("Stack is empty");
		}
		int answer = numStack[top];
		top--;
		return answer;
	}
}