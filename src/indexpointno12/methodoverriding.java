package indexpointno12;

public class methodoverriding
{
public void additionof2no(int a ,int b)
{
	int c = a +b ;
	System.out.println(c);
}



public static void main(String[] args) 
{
	methodoverriding x= new methodoverriding();
	x.additionof2no(12, 33);
	x.additionof3no(12, 54, 66);
	
}
 public void additionof3no(int q, int p , int w)
 {
	 int z =q + p+ w;
	 System.out.println(z);
	 
 }

}
