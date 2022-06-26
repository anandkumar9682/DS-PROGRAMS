

public class Recurence{

	static java.util.Scanner scn=new java.util.Scanner(System.in);

	static java.util.ArrayList<Integer> al=new java.util.ArrayList<>();

	public static void main(String[] args) {

		System.out.println("Enter Size of Array");

		int size=scn.nextInt();

		int a[]=getArray( size );

		printArray(a);

		a=reccurence(a);

		System.out.println(al);

	}

	public static int[] reccurence( int arr[] ){

		int size= arr.length;

		for ( int i = 0 ; i < size  ; i++ ) {

			for( int j=i+1 ; j < size  ; j++ ){

				if( arr[i] == arr[j] )
					al.add( arr[j] );
			}
		
		}
		return arr;
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