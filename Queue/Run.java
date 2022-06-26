public class Run{

	public static void main(String[] args) {

		Queue queue=new Queue(4);

		queue.add(1);
		queue.add(2);
		System.out.print( queue.remove() +"  ");
		System.out.print( queue.remove() +"  ");

		queue.add(3);
		queue.add(4);
		System.out.print( queue.remove() +"  ");
		System.out.print( queue.remove() +"  ");

		queue.add(3);
		queue.add(4);
		System.out.print( queue.remove() +"  ");
		System.out.print( queue.remove() +"  ");

	}

}

class Queue{

	int []arr;
	int rear;
	int front;

	public Queue(int size){
		arr=new int[size];
		rear=arr.length-1;
		front=arr.length-1;
	}

	public void add( int ele ){

	if( rear >= 0 ){

		arr[rear]=ele;

		--rear;
		
	}
	else
		System.out.println("Overflow");

	}

	public int remove(){

		int d=0;

		if( front >= 0 ){

			d = arr[front--];

		}else 
			System.out.println("underflow");

		return d;

	}

	public int peek(){
		return arr[front];
	}

	public int size(){
		return 0;
	}

}