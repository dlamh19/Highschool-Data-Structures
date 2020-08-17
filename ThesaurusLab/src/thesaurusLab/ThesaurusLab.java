//David Lam
package thesaurusLab;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class ThesaurusLab 
{
	public static void main(String[] args) 
	{	
		ThesaurusClass thesaurus = new ThesaurusClass();
		
		//Create Thesaurus
		thesaurus.addSyn("fun", "amazing");
		thesaurus.addSyn("fun", "entertainment");
		thesaurus.addSyn("fun", "amusement");
		thesaurus.addSyn("fun", "pleasure");
		thesaurus.addSyn("fun", "enjoyable");
		thesaurus.addSyn("mad", "delirious");
		thesaurus.addSyn("mad", "frantic");
		thesaurus.addSyn("mad", "nutty");
		thesaurus.addSyn("mad", "kooky");
		thesaurus.addSyn("amazing", "incredible");
		thesaurus.addSyn("amazing", "astonishing");
		thesaurus.addSyn("amazing", "fabulous");
		thesaurus.addSyn("amazing", "fantastic");
		thesaurus.addSyn("amazing", "wonderful");
		
		//Print Thesaurus
		thesaurus.printWord("mad");
		thesaurus.printWord("fun");
		thesaurus.printWord("amazing");
		thesaurus.printWord("wow");
		
		//Add Synonyms
		System.out.println();
		thesaurus.addSyn("answer", "reply");
		thesaurus.addSyn("answer", "respond");
		thesaurus.addSyn("answer", "retort");

		//Print Changed Thesarus
		System.out.println();
		thesaurus.printWord("fun");
		thesaurus.printWord("amazing");
		thesaurus.printWord("answer");
		thesaurus.printWord("wow");

		//Remove Synonym
		System.out.println("\nAfter removing amazing, the words effected are " + thesaurus.removeSyn("amazing"));
		System.out.println("After removing bop, the words effected are " + thesaurus.removeSyn("bop"));
		
		//Print Removed Synonym
		System.out.println();
		thesaurus.printWord("fun");
		thesaurus.printWord("amazing");
		thesaurus.printWord("mad");
		thesaurus.printWord("wow");	 
		
	}
}
/*
Synonym for mad is [delirious, frantic, kooky, nutty]
Synonym for fun is [amazing, amusement, enjoyable, entertainment, pleasure]
Synonym for amazing is [astonishing, fabulous, fantastic, incredible, wonderful]
Synonym for wow is null

Synonym for fun is [amazing, amusement, enjoyable, entertainment, pleasure]
Synonym for amazing is [astonishing, fabulous, fantastic, incredible, wonderful]
Synonym for answer is [reply, respond, retort]
Synonym for wow is null

After removing amazing, the words effected are [fun]
After removing bop, the words effected are []

Synonym for fun is [amusement, enjoyable, entertainment, pleasure]
Synonym for amazing is [astonishing, fabulous, fantastic, incredible, wonderful]
Synonym for mad is [delirious, frantic, kooky, nutty]
Synonym for wow is null
*/
