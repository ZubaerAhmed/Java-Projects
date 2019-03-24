package myBasicPackage;

public class Sentence {

	public static void main(String[] args) {

		UserInput u = new UserInput();
		u.user1();
		
		Word w = new Word();
		w.myWord(u.getSentence());
		
		NonAlphabeticCharacter n = new NonAlphabeticCharacter();  
		n.nonAlphabet(u.getSentence());
		
		DelimetedWord d = new DelimetedWord();
		d.delimited(u.getSentence());		
	}
}
