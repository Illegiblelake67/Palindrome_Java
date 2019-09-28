package Main.Palindrome;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) {
    	
    	System.out.println("Please enter a word check weather it's a Palindrome or not:");
    	//Reads phrase from command line
    	String temp = "";
    	Scanner input = new Scanner(System.in);
    	String string = input.nextLine();
    	input.close();
    	
    	int length = string.length();
    	
    	for(int i = length-1; i >=0; i--) {
    		temp = temp + string.charAt(i);
    	}
    			
    	if (temp.equalsIgnoreCase(string)){
			System.out.println(string + " is a palindrome");
		}else {
			System.out.println(string + " is not a palindrome");
		}
  
    }	
    
//   private static String palindrome(String input) {
//   	String temp = input;
//    	String newPhrase;
//    	StringBuilder phrase = new StringBuilder();
//    	phrase.append(temp);
//    	phrase = phrase.reverse();
//    	newPhrase = phrase.toString();
//   	return newPhrase;
//    	
//      }
    
    
}
