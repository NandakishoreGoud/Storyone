import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

class StringUtility {
	
	public static TreeMap<String , Integer> countOccurences(String inputText, String charsequence) {
		int count = 0;
		TreeMap<String , Integer> map=new TreeMap<String , Integer>();
		StringTokenizer token = new StringTokenizer(charsequence, ",");
		String[] s=inputText.split("");
		ArrayList<String> list=new ArrayList<String>(); 
		while (token.hasMoreTokens()) {
			list.add(token.nextToken());
		}
			for(int j=0;j<list.size();j++)
			{
				for (int i = 0; i < s.length; i++)
				{
                 if ((list.get(j).equals(s[i]))) 
				 count++;
		        }
				System.out.println(list.get(j)+" = "+count+" times");
				map.put(list.get(j), count);
				count=0;
			}
			return map;
		}
	}

