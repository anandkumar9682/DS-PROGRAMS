public class DelBef{

	public static void main(String[] args) {

		LinkedList start=new LinkedList(10);
		
		insert(start,20);

        insert(start,30);
        insert(start,40);
        insert(start,50);
        insert(start,60);


		trav( start);

		start=delbef(start,40);

		System.out.println();

		trav( start);


	}

	public static LinkedList delbef( LinkedList head ,int ele){

		 if ( head == null )
            return null;
      
        LinkedList second_last = head;

        while (second_last.next != null)
        {

        	if( second_last.next.next.data==ele ){

        		second_last.next=second_last.next.next;
        		return head;

        	}

        	second_last=second_last.next;


        }
        	
            

 
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