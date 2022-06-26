public class Reverse{

	static java.util.Scanner scn=new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Size of Array");

		int size=scn.nextInt();

		int a[]=getArray( size );

		printArray(a);

		a=reverse(a);

		printArray(a);

		a=reverse1(a);

		printArray(a);
	}

	public static int[] reverse1( int arr[] ){

		int size,temp,dj;

		if( arr.length % 2==0 )
			{
				size=arr.length;
				dj=1;
			}
		else
			{
				size=arr.length+1;
				dj=2;
			}



		for ( int i = 0 ; i < size / 2 ; i++ ) {

			temp = arr[ i ] ;

			arr[i] = arr[ ( size-dj ) - i ];

			arr[ ( size-dj ) - i ] = temp;
		
		}

		return arr;

	}

	public static int[] reverse( int arr[] ){

		int newArr[] = new int [ arr.length ];
		int i,j=0;

		for ( i = arr.length-1 ; i >= 0  ; i-- ) {

			newArr[j] = arr[i];

			++j;

		}

		return newArr;

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