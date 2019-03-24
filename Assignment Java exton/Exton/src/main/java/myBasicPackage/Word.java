package myBasicPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Word{
	 	
	public void myWord(String sentence){ 
		
		char firstAlphbet = ' ';
		char lastAlphabet = ' ';  
		int numberOfAlphabet = 0;
		
		String[] word = sentence.split(" "); 
		
		System.out.println("\nQuestion 1: First alphabet, number of middle alphabet, Last Alphabet");
		System.out.println("Answer: ");
		for(int i=0; i<word.length; i++){ 
				String cw = word[i];			  
							
				char[] a = cw.toCharArray();
				String b = Arrays.toString(word);
					for (int j=0; j<a.length; j++){  
					
						firstAlphbet = cw.charAt(0);
					    lastAlphabet = cw.charAt(a.length-1);  
						numberOfAlphabet = cw.length()-2;			     
				} 					
		System.out.print("\t"+(firstAlphbet)+""+numberOfAlphabet+""+(lastAlphabet)+"  "); 				
	}	
}
}
