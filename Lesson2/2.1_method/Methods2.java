package ap_method;

        //call by value
public class Methods2 {

int val=150;

int operation(int val) {
	val =val*10/100;
	return(val);
}

   public static void main(String args[]) {
	Methods2 d = new Methods2();
	System.out.println("Before operation value of data is "+d.val);
	d.operation(100);
	System.out.println("After operation value of data is "+d.val);
	}
}