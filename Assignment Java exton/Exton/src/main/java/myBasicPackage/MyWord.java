package myBasicPackage;

import java.util.Arrays;
import java.util.Scanner;

public class MyWord {
	
	
String sentence = null; 
	
	public void myWord() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter sentence\t"); 
		String sentence = sc.nextLine();  
		
		char firstAlphbet = ' ';
		char lastAlphabet = ' ';  
		int numberOfAlphabet = 0;
		//String sentence = "I want@ to walk$ my dog&";
		String[] word = sentence.split(" "); 
		
		System.out.println("\nQuestion 1: First alphabet, number of middle alphabet, Last Alphabet");
		System.out.println("Answer: ");
		for(int i=0; i<word.length; i++){ 
				String cw = word[i];			  
				//System.out.println(cw); 
				
				char[] a = cw.toCharArray();
				String b = Arrays.toString(word);
					for (int j=0; j<a.length; j++){  
					//char c = cw.charAt(j); 
						firstAlphbet = cw.charAt(0);
					    lastAlphabet = cw.charAt(a.length-1);  
						numberOfAlphabet = cw.length()-2;	
				
				} 
				System.out.print("\t"+(firstAlphbet)+""+numberOfAlphabet+""+(lastAlphabet)+"  ");
	}
 
//------------------------------------------------------------------------
	int count = 1;

	System.out.println("\n\nQuestion 2: Delimited by any non-alphabetic characters.");
	System.out.println("Answer:");

//	System.out.println("You wrote: "+sentence); 

	for(int i=0; i<sentence.length(); i++){ 
		char c = sentence.charAt(i);
		
		 if (!(Character.isLetter(c))) {
			int b = sentence.indexOf(c);
	        System.out.println("\t"+count+": index: "+i+" - "+c+" : is NOT alphabet");
	        count++;
		 	}
	}
//---------------------------------------------------------------------------	
	String newS = sentence.replaceAll("[^a-zA-Z]"," ");
	System.out.println("\nQuestion 3: Delimited all non-alphabetic characters");
	System.out.println("Answer:");
	System.out.println("\tOriginal sentence: "+sentence);
	System.out.println("\tNew  sentence is : "+newS);
	
}
	
	
	

}
