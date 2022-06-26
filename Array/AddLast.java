public class InsertMid{

	static java.util.Scanner scn=new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Size of Array");

		int size=scn.nextInt();

		int a[]=getArray( size );

		printArray(a);

		a=insertLast(a);

		printArray(a);
	}

	public static int[] insertLast(int arr[]){

		System.out.println("Enter Element for Add.");
		int value = scn.nextInt();

      	int i=0;
		
		int newArr[] = new int[ arr.length + 1 ];

		for ( i=0 ; i < newArr.length ; i++ ) {

			if( i == newArr.length-1 )
				newArr[i]=value;
			else
				newArr[i]=arr[i];
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