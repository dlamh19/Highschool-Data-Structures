//David Lam
package basicEmulator;

import java.util.HashMap;
import java.util.Map;

public class CodeLine {
	
	private int num;
	private String code;
	private Map<Integer, String> map = new HashMap<Integer, String>();
	
	public CodeLine (int x, String y)
	{
		num = x;
		code = y;
		map = new HashMap <Integer, String>();
	}
	public void addCode(int line, String codes)
	{
	
	}

}