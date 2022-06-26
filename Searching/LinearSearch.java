public class LinearSearch{

	static java.util.Scanner scn=new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Size of Array");

		int size=scn.nextInt();

		int a[]=getArray( size );

		printArray(a);

		searchElement(a);

		
	}

	public static void searchElement(int arr[]){

		System.out.println("Enter Element for Search");
		int value = scn.nextInt();

		for ( int i=0 ; i < arr.length ; i++ ) 
			if( arr[i] == value ){
				System.out.println("Element Found Index : "+i );
				return ;
			}

			System.out.println("Not Found Element");
	}


	public static int[] getArray( int size ){

		int []arr=new int[size];

		for( int i=0; i<size ; i++){
			System.out.println("Enter "+i+" Element");
			arr[i]=scn.nextInt();
		}

		return arr;
	}

	public static void printArray( int []arr){
		System.out.println();
		for( int i : arr)
			System.out.print("{"+i+"}");
	}

}