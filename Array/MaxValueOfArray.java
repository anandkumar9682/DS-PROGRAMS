
public class MaxValueOfArray{

	static java.util.Scanner scn=new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Size of Array");

		int size=scn.nextInt();

		int a[]=getArray( size );

		printArray(a);

		int maxValue=max(a);

		System.out.println("Maximum Value of Array : "+maxValue);

	
	}

	public static int max( int arr[] ){

		int max=arr[0];


		for( int i = 0 ; i < arr.length; i++ ){

			if( max < arr[i] )
				max=arr[i];

		}

		return max;


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