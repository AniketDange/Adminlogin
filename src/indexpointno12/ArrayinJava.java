package indexpointno12;

public class ArrayinJava {

	public static void main(String[] args) 
	{
	//int a[]={10,20,30,40,};
	//System.out.println(a.length);
	
	int b[]= new int[5];
	System.out.println(4);
	
		int a[]={10,20,30,40,50,12,19,17,33};
		
		
		for (int i=0; i<a.length;i++)
		{
			if (a[i]%2 ==0)
			{
				System.out.println(a[i]+"even no");
			}
			else
			{
				System.out.println(a[i]+"odd no");
			}
		}
		int max=0;
		for(int j=0; j<a.length; j++)
		{
			if(a[j]>max)
			{
				max=a[j];
			}
			System.out.println(max);
		}
  
 

	}

}
