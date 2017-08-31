/*import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Syntaxhighlightinghavingdifferentcolors {
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

import java.util.Map;

public class Syntaxhighlightinghavingdifferentcolors {
	public static String keyWordHighlighter(String inputText, Map<String, String> keyWord) {
		for (Map.Entry<String, String> entry : keyWord.entrySet()) {
			String keyword = entry.getKey();
			String color = entry.getValue();
			inputText = inputText.replaceAll(keyword, "[" + color + "]" + keyword + "[" + color + "]");
		}
		return inputText;
	}

	/*
	 * public static String replacement(String keyword, String color) { return
	 * "[" + color + "]" + keyword + "[" + color + "]";
	 */ }
