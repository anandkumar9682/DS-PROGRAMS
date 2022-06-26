public class DelEle{

	static java.util.Scanner scn=new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Size of Array");

		int size=scn.nextInt();

		int a[]=getArray( size );

		printArray(a);

		a=del(a);

		printArray(a);
	}

	public static int[] del(int arr[]){

		System.out.println("Enter Element for delete");
		int value = scn.nextInt();


		
		boolean flag=false;
		int newArr[] = new int[ arr.length - 1 ];

		for ( int i=0 ; i < arr.length ; i++ ) {

			if( arr[i] == value ){
				newArr[i]=arr[i+1];
				flag=true;
				--i;
			}
			else if(flag)
				newArr[i] = arr[i];
			else
				newArr[i] = arr[i];


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