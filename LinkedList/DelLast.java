public class DelLast{

	public static void main(String[] args) {

		LinkedList start=new LinkedList(10);
		
		insert(start,20);

        insert(start,30);

		trav( start);

		start=delLast(start);

		System.out.println();

		trav( start);


	}

	public static LinkedList delLast( LinkedList head ){

		  if ( head == null )
             return null;
 
        if ( head.next == null ) {
            return null;
        }
 
      
        LinkedList second_last = head;

        while (second_last.next.next != null)
        	
            second_last = second_last.next;
 
        
        second_last.next = null;

 
        return head;
		
	}

	public static void trav( LinkedList l){

		if(l!=null){
			System.out.print(l.data+" ");

			while( l.next!=null ){
				System.out.print(l.next.data+" ");
				l=l.next;
			}
		}
	}

	public static void insert(LinkedList start , int data ){

		LinkedList linkedList=start;

		while( linkedList.next!= null )
			linkedList=linkedList.next;

		linkedList.next=new LinkedList(data);
	}
}

class LinkedList{

	 int data;
	 LinkedList next=null;

	 public LinkedList(int d){
	 	this.data=d;
	 }
	 
}