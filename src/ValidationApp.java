import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidationApp{
	
	public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
 
 System.out.print("Please enter a valid Name: ");
 String name = input.next();
 if(validateName(name)){
  System.out.println("Name is valid!");
 }
 else{
  System.out.println("Sorry,Name is not valid!");
 }
 
 System.out.print("Please enter a valid Email: ");
 String email = input.next();
 if(validateEmail(email)){
  System.out.println("Email is valid!");
 }
 else{
  System.out.println("Sorry,Email is not valid!");
 }
 
 System.out.print("Please enter a valid Phone number: ");
 String phoneNumber = input.next();
 if(validatePhoneNumber(phoneNumber)){
  System.out.println("Phone number is valid!");
 }
 else{
  System.out.println("Sorry, this phone number is not valid!");
 }
 
 System.out.print("Please enter a valid date: ");
 String date = input.next();
 if(validateDate(date)){
  System.out.println("Date is valid!");
 }
 else{
  System.out.println("Sorry, this date is not valid!");
 }
 
}

public static boolean validateName(String name){
 String regex = "[A-Z][a-z]{1,30}$";
 
 Pattern pattern = Pattern.compile(regex);
 
 Matcher matcher = pattern.matcher(name);
  
 return matcher.matches();
}

public static boolean validateEmail(String email){
 String regex = "[A-Za-z0-9]{5,30}@[A-Za-z0-9]{5,10}.[A-Za-z0-9]{2,3}$";
 
 Pattern pattern = Pattern.compile(regex);
 
 Matcher matcher = pattern.matcher(email);
  
 return matcher.matches();
}

public static boolean validatePhoneNumber(String phoneNumber){
 String regex = "[0-9]{3}-[0-9]{3}-[0-9]{4}$";
 
 Pattern pattern = Pattern.compile(regex);
 
 Matcher matcher = pattern.matcher(phoneNumber);
  
 return matcher.matches();
}

public static boolean validateDate(String date){
 String regex = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}$";
 
 Pattern pattern = Pattern.compile(regex);
 
 Matcher matcher = pattern.matcher(date);
  
 return matcher.matches();
}
}