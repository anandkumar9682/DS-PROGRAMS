
class GetSumFromPairValue
{
	
	static boolean pairInSortedRotated(int arr[],int n, int x)
	{
		
		int i;
		for (i = 0; i < n - 1; i++)
			if (arr[i] > arr[i+1])
				break;
				
		int l = (i + 1) % n; 
						
		int r = i;
	
	
		while (l != r)
		{
		
			if (arr[l] + arr[r] == x)
				return true;
	
		
			if (arr[l] + arr[r] < x)
				l = (l + 1) % n;
				
			else
				r = (n + r - 1) % n;
		}
		return false;
	}

	
	static{
		int arr[] = {11, 15, 6, 8, 9, 10};
		int sum = 16;
		int n = arr.length;
	
		if (pairInSortedRotated(arr, n, sum))
			System.out.print("Array has two element with sum 16");
		else
			System.out.print("Array doesn't have two elements with sum 16 ");

	
        System.exit(1);

	}



}



public class Screen{

	static java.io.PrintWriter writer = new java.io.PrintWriter(System.out);   

	public static void print(Object o){
        writer.print(o);  
	    writer.flush();  
        
	}

	public static void println(Object o){
        writer.println(o);  
	    writer.flush();   
	}

	public static void println(){
        writer.println();  
	    writer.flush();   
	}

}