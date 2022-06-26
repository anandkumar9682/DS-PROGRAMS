class ArraAllValueSum
{
public static void main(String args[])
{  
 System.out.println();    System.out.println();  
int a[]={2,3,5,1,3,8};  
int count=0;
 int length1 =a.length;
 System.out.println("All Elements Length Of Array:   "+length1);  
   System.out.println();  
  
for(int i=0;i<a.length;i++)
{  
  System.out.println(a[i]);  
      count=count+a[i];
 }  
  
  
    System.out.println();    System.out.println();  
  
   System.out.println("All Value Sum Of Array : "+count);  
  
  
  
  
  
}
}  