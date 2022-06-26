public class Run1{

	public static void main(String[] args) {

		Queue queue=new Queue(4);

		queue.add(1);
		queue.add(2);

		queue.add(3);
		queue.add(4);

		System.out.println( queue.remove() );

		queue.add(4);
		

		

	}

}

class Queue{

	int []arr;
	int rear=0;
	int front=0;
	int size;

	public Queue(int qSize){
		arr=new int[qSize];
		size=arr.length;
	}

	public void add( int ele ){

	if( rear <= size ){

		rear=( front + rear ) % size ;

		arr[rear]=ele;

		System.out.println( rear );

		rear++;
	}
	else
		System.out.println("Overflow");

	}

	public int remove(){

		int d=3333;

		if( front != size ){

			front = ( front - rear ) % size ; 
			d=arr[front];
			front++;

		}else 
			System.out.println("underflow");

		return d;

	}

}