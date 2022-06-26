public class BubbleSortViaDeccending{

	

	public static void main(String[] args) {
		
		int arr[]={64,121,4564,1,46,5156,41};

		printArray(arr);

		arr=bubbleSort(arr);

		printArray(arr);

	}

	public static void printArray(int []arr){
		for(int i:arr)
			System.out.print(i+"  ");

		System.out.println();
	}

	public static int [] bubbleSort(int []arr){

		for( int i=0; i < arr.length-1 ; i++)

			for( int j=0 ; j < arr.length-i-1 ; j++ ){

				if( arr[j] < arr[j+1] ){

					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;

				}

			}


		System.out.println();

		return arr;
	}







}