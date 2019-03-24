package myBasicPackage;

import java.util.Scanner;

public class UserInput {
	public String sentence;
	
	public String getSentence(){
		return sentence;
	}  
	public void setSentence(String sentence){
		this.sentence = sentence;
	}
	
	public void user1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter sentence\t");  
		
		String sentence = sc.nextLine();
		setSentence(sentence);	 
	}
}
