import java.io.PrintWriter;
class Rotation {

	static{
		
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d=3;
		
		for( int v : a )
            Screen.print(v+"  ");

        for( int i=0 ; i<d ; i++ )
        	rotate(a);

        Screen.println();

        for( int v : a )
            Screen.print(v+"  ");

        System.exit(1);

	}

	public static void rotate ( int[] arr ){

		int firstValue=arr[0];

		for ( int i=0; i<arr.length-1; i++ )
			arr[i]=arr[i+1];

			arr[arr.length-1]=firstValue;
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
