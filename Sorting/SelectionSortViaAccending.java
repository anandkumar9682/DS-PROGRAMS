public class SelectionSortViaAccending{

	static java.util.Scanner scn=new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Size of Array");

		int size=scn.nextInt();

		int a[]=getArray( size );

		printArray(a);

		a=sorting(a);
		printArray(a);

		
	}

	public static int[] sorting(int arr[]){

		int temp;

		for( int i=0 ; i< arr.length; i++ ){

			for( int j=i+1 ; j < arr.length ; j++ ){

				if( arr[i] > arr[j] ){
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}

			}

			printArray(arr);
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