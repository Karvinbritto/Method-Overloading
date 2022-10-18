package method_overloading;

class sum{
	 void x (int A,int B)
	{
		System.out.println(A*B);
		
	}

	void x  (int x,double y)
	{
		System.out.println(x+y);
		
	}
	
	void x (float x, float y, float z)
	{
		System.out.println(x+y+z);
	}
}

public class Overload {

	public static void main(String [] args)
	{
		
	sum a1=new sum ();
		a1.x(2, 4);
		a1.x(2, 4d);
		a1.x(2f, 3f, 4f);
	}

}
