package pp_Validation_Of_EmailId;
import java.util.regex.*;    
import java.util.*;
public class Email_verification {
	public static void main(String[] args) {      
		        ArrayList<String> emails = new ArrayList<String>();  
		        emails.add("pushpak.patil@gmail.com");  
		        emails.add("patilpushpak@gmail.com");  
		        emails.add("pushpakpatil12@gmail.com");  
		        emails.add("patilpushpak#@gmail.co.in");  
		        emails.add("patil123@gmail.com");  
		        emails.add("pushp@gmail.com");  
		        //Add invalid emails in list  
		        emails.add("@gmail.com");  
		        emails.add("pushpak#gmail.com");  
		        //Regular Expression   
		        String regex = "^(.+)@(.+)$";  
		        //Compile regular expression to get the pattern  
		        Pattern pattern = Pattern.compile(regex);  
		        //Iterate email array list  
		        for(String email : emails){  
		            //Create instance of matcher   
		            Matcher matcher = pattern.matcher(email);  
		            System.out.println(email +" : "+ matcher.matches()+"\n");
		}  
	}
}
