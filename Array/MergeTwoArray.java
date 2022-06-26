public class MergeTwoArray{

	static java.util.Scanner scn=new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Size of First Array");

		int size=scn.nextInt();

		int a[]=getArray( size );

		System.out.println("Enter Size of Second Array");

		size=scn.nextInt();

		int b[]=getArray( size );

		a=merge(a,b);

		printArray(a);
	}

	

	public static int[] merge( int [] a , int[] b){

		int size=a.length+b.length;

		int newArr[]=new int[size];

		int j=0;

		for( int i=0 ; i < a.length ; i++ )
			newArr[i]=a[i];

		for( int i=a.length ; i < size ; i++ ){
			newArr[i]=b[j];
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