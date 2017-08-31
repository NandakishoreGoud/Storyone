import java.util.List;

/*import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class syntaxhighightingandcasechange {
	static  String keywordsHighlighting1(String inputtext, String inputkey) {

		List<String> inputtextList = new ArrayList<String>();
		List<String> keywordList = new ArrayList<String>();
		List<String> colorList = new ArrayList<String>();
		List<String> appendedList = new ArrayList<String>();
		StringTokenizer st1 = new StringTokenizer(inputtext, " ");
		String[] keyColorarr = inputkey.split("\\W");

		while (st1.hasMoreTokens()) {
			inputtextList.add(st1.nextToken());
		}
		for (int i = 0; i < keyColorarr.length; i++) {
			if (i % 2 == 0) {
				keywordList.add(keyColorarr[i]);
			} else {
				colorList.add(keyColorarr[i]);
			}
		}
		for (int i = 0; i < inputtextList.size(); i++) {
			if (keywordList.contains(inputtextList.get(i))) {
				for (int j = 0; j < keywordList.size(); j++) {
					if (inputtextList.get(i).equals(keywordList.get(j))) {
						appendedList
								.add("[" + colorList.get(j) + "]" + keywordList.get(j) + "[" + colorList.get(j) + "]");
					}
				}
			} else {
				appendedList.add(inputtextList.get(i));
			}

		}
		String output="";
		for (String temp: appendedList) {
			output=temp;
			System.out.print(temp + " ");
		}
		return output;

	}


}
*/
public class syntaxhighightingandcasechange {

	static  String keywordsHighlightingwithcases(String input, List<String> keywords) {
		for(String s:keywords){
			String[] keys=s.split(":");
			if(keys[2].equals("capital"))
			{
			input=input.replace(keys[0], "["+keys[1]+"]"+keys[0].toUpperCase()+ "["+keys[1]+"]");
			}
			else if(keys[2].equals("lower")){
				input=input.replace(keys[0], "["+keys[1]+"]"+keys[0].toLowerCase()+ "["+keys[1]+"]");
			}
					
		}
		System.out.println(input);
		return input;
	}
	}