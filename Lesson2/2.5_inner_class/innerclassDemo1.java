package ap_inner_class;
public class innerclassDemo1 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	innerclassDemo1  ob=new innerclassDemo1 ();  
	ob.display();  
	}
}

