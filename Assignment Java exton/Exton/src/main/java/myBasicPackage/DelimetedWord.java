package myBasicPackage;

public class DelimetedWord{
	
	public void delimited(String sentence){
		
		String newS = sentence.replaceAll("[^a-zA-Z]"," ");
		System.out.println("\n\nQuestion 3: Delimited all non-alphabetic characters");
		System.out.println("Answer:");
		System.out.println("\tOriginal sentence: "+sentence);
		System.out.println("\tNew  sentence is : "+newS);
		}
	}

