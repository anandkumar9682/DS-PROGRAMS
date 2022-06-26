public class AddAfterElement{

	static java.util.Scanner scn=new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Size of Array");

		int size=scn.nextInt();

		int a[]=getArray( size );

		printArray(a);

		a=insertMidEle(a);

		printArray(a);
	}

	public static int[] insertMidEle(int arr[]){

		System.out.println("Enter index for add element.");
		int index = scn.nextInt();

		System.out.println("Enter new Element.");
		int value = scn.nextInt();

		int i=0;

		boolean flag=false;

		int newArr[] = new int[ arr.length + 1 ];

		for ( i=0 ; i < arr.length ; i++ ) {

			if( arr[i] == index ){

				newArr[ i ] = arr[i] ;

				newArr[i+1]=value;

				flag=true;

			}
			else if(flag)
				newArr[i+1] = arr[i];
		
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