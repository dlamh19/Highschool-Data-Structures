//David Lam
package thesaurusLab;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class ThesaurusClass 
{
	private HashMap<String, Set> wordMap;

	public ThesaurusClass()
	{
		wordMap = new HashMap<String, Set>();
	}

	public void addSyn(String word, String syn)
	{
		Set<String> syns = wordMap.get(word);

		if(syns == null)
		{
			syns = new TreeSet<String>();
			wordMap.put(word,  syns);
		}
		syns.add(syn);	
	}

	public Set<String> removeSyn(String syn)
	{
		Set<String> changeWord = new TreeSet<String>();

		for(String word : wordMap.keySet())
		{
			Set<String> synonyms = wordMap.get(word);
			if(synonyms.contains(syn))
			{
				synonyms.remove(syn);
				changeWord.add(word);
			}
		}
		return changeWord;
	}

	public void printWord(String syn)
	{
		System.out.println("Synonym for " + syn + " is " + wordMap.get(syn));
	}		
}
