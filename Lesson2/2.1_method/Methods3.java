package ap_method;
//method overloading
public class Methods3 
{
	public void area(int b,int h)
	{
       System.out.println("Area of Triangle : "+(0.5*b*h));
	}
	public void area(int r) 
	{
       System.out.println("Area of Circle : "+(3.14*r*r));
	}
	public static void main(String args[])
		{
			Methods3 ob=new Methods3();
			ob.area(10,12);
			ob.area(5);  
		}
}