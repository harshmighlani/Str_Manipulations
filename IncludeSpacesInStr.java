package strTest;

import java.util.HashSet;
import java.util.Set;

public class IncludeSpacesInStr {

	public static void main(String[] args) {

		insertSpace("abcd");
	}
	private static void insertSpace(String str)
	{
		StringBuilder sb ;
		Set<String> setStr = new HashSet<String>();
		for(int i=1;i<str.length();i++)
		{
			sb = new StringBuilder(str);
			sb.insert(i, "_");
			setStr.add(sb.toString());

			for(int j=1;j<str.length();j++)
			{
				if(i-j!=1 && i-j!=0 && j-i!=1)
				{
					sb.insert(j, "_");
					setStr.add(sb.toString());
				}
			}
			for(String s: setStr)
			{
				System.out.println(s);
			}
		}

	}
}
