package indexpointno12;

public class Array2 {

	public static void main(String[] args) 
	{
	int temp;
		int a[]={10,20,30,40,50,60,90,};
		//System.out.println(a.length);
	
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
		if(a[i]< a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]= temp;
		}
		System.out.println(a[i]);
		
			}
				
			}
		
	}

}
