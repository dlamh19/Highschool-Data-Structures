package extendSet;
import java.util.Set;
import java.util.TreeSet;

public class ExtendClass extends TreeSet<Integer>
{
	private TreeSet<Integer> holder;
	
	public ExtendClass()
	{
		holder = new TreeSet<Integer>();
	}
	
	public Set<Integer> getInter(ExtendClass x, ExtendClass y)
	{
		Set<Integer> newSet = new TreeSet<Integer>();
		for(int i : x)
			for(int j: y)
				if( i== j)
					newSet.add(i);
		return newSet;
	}
	
	public Set<Integer> union(ExtendClass x, ExtendClass y)
	{
		Set<Integer> newSet = new TreeSet<Integer>();
		for(int i: x)
			newSet.add(i);
		for(int i: y)
			newSet.add(i);
		return newSet;
	}
	
	public Set<Integer> getDiff (ExtendClass x, ExtendClass y)
	{
		Set<Integer> newSet = new TreeSet<Integer>();
		for(int i: x)
		{
			newSet.add(i);
			for(int j: y)
				if(i == j)
					newSet.remove(i);
		}
		return newSet;
	}
	
	public boolean isSubsetOf(ExtendClass x, ExtendClass y)
	{
		return y.containsAll(x);
	}
	
	public boolean isDisjoint(ExtendClass x, ExtendClass y)
	{
		for(int i: x)
			for(int j: y)
				if(i ==j)
					return false;
		return true;
	}
	public void cartProduct(ExtendClass x, ExtendClass y)
	{
		for(int i: x)
			for(int j: y)
				System.out.println(i + " " + j);
	}
}