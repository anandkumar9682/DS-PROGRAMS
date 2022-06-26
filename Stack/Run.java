public class Run{

	public static void main(String[] args) {

		Stack start=new Stack(5);

		start.push(1);
		start.push(2);
		start.push(3);
		start.push(4);
		start.push(5);

		System.out.println( start.pop() );
		System.out.println( start.pop() );
		System.out.println( start.pop() );
		System.out.println( start.pop() );
		System.out.println( start.pop() );
		System.out.println( start.pop() );


		
	}

}

class Stack{

	 int data[];
	 
	 int top=-1;

	 public Stack(int size){
	 	data=new int[size];
	 }

	 public void push(int ele){

	 	if( top == data.length-1 )
	 		System.out.println("Overflow");
	 	else{
	 		++top;
	 		data[top]=ele;
	 	}

	 }

	 public int pop(){

	 	int d=-1;

	 	if( top<0)
	 		System.out.println("Underflow");
	 	else{
	 		d=data[top];
	 		--top;
	 		}

	 	return d;

	 }
	 
}