import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = sc.nextLine();
		if(getName(name)) {
			System.out.println("Name is valid!");
		}
		else {
			System.out.println("Sorry, this name is not valid!");
		}
		
		System.out.println("Please enter your email: ");
		String email = sc.nextLine();
		if(getEmail(email)) {
			System.out.println("Email is valid!");
		}
		else {
			System.out.println("Sorry, this email is not valid!");
		}
		
		System.out.println("Please enter your Phone Number: ");
		String phoneNumber = sc.nextLine();
		System.out.println();
		if(getPhoneNumber(phoneNumber)) {
			System.out.println("Phone number is valid!");
		}
		else {
			System.out.println("Sorry, this phone number is not valid!");
		}
		
		System.out.println("Please enter a valid date: ");
		String date = sc.nextLine();
		if(getDate(date)) {
			System.out.println("Date is valid!");
		}
		else {
			System.out.println("Sorry, this date is invalid");
		}
	}
	
		public static boolean getName(String name) {
			String regex = "[A-Z][a-z]{1,30}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(name);
			return matcher.matches();
		}
		
		public static boolean getEmail(String email) {
			String regex = "[A-Za-z0-9]{5,30}@[A-Za-z0-9]{5,10}.[A-Za-z0-9]{2,3}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		}
		
		public static boolean getPhoneNumber(String phoneNumber) {
			String regex = "[0-9]{3}-[0-9]{3}-[0-9]{4}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(phoneNumber);
			return matcher.matches();
		}
		
		public static boolean getDate(String date) {
			String regex = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(date);
			return matcher.matches();
		}
}
