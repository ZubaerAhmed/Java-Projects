package myBasicPackage;

public class NonAlphabeticCharacter{
	
		public void nonAlphabet(String sentence){

			int count = 1;
			System.out.println("\n\nQuestion 2: Delimited by any non-alphabetic characters.");
			System.out.println("Answer:");

			for(int i=0; i<sentence.length(); i++){ 
				char c = sentence.charAt(i);
				
				 if (!(Character.isLetter(c))) {
					int b = sentence.indexOf(c);
			        System.out.println("\t"+count+": index: "+i+" character "+c+" : is NOT alphabet");
			        count++;
				 	}
			}
	} 
}		 



