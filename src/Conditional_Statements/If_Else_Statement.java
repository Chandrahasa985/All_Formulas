package Conditional_Statements;

public class If_Else_Statement {

	public static void main(String[] args) {
		
		
		boolean InternetStatus = true;
		boolean GPSStatus = true;
		
		if(InternetStatus) {
			if(GPSStatus){
				System.out.println("You Can Login to HireQA Website");
			} else {
				System.out.println("Please Enable GPS and Try Again");
			} }else {
				System.out.println("Please Enable Internet and Try Again");
			}
		
		
		String Username = "Chandrahasa";
		String Password = "Chan@123";
		
		if(Username.isEmpty() || Password.isEmpty()) {
			System.out.println("Please Enter Username or Password");
		
		}else{
			if(Username.equals("Chandrahasa") && Password.equals("Chan@123"))
			{System.out.println("Welcome to HireQA Academy");
			}else{
				System.out.println("Please Enter Valid Credentials");}}
		
		
		}
	}


