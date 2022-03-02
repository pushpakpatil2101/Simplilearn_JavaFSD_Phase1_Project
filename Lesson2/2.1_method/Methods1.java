package ap_method;

public class Methods1 {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}

public static void main(String[] args) {

	Methods1 b=new Methods1();
	int ans= b.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+ans);
	}

}