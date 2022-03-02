package ap_inner_class;
public class innerclassDemo {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		innerclassDemo obj=new innerclassDemo();
		innerclassDemo.Inner in=obj.new Inner();  
		in.hello();  
	}
}

