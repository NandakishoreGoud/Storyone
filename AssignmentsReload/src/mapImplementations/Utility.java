package mapImplementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utility {
	public static void main(String[] args) {
		String inputText = "if we write a program and compile it, then we can run the program to get output";
		List<String> keyWords = new ArrayList<>();
		keyWords.add("as");
		keyWords.add("and");
		keyWords.add("then");
		System.out.println(SingleColor.highlightingKeys(inputText, keyWords));
		//-----------
		
		Map<String, String> hashmap = new HashMap<>();
		hashmap.put("as", "blue");
		hashmap.put("if", "red");
		hashmap.put("and", "red");
		hashmap.put("then", "green");
		hashmap.put("when", "blue");
		System.out.println(TwoColor.highlightingKeys(inputText, hashmap));
		
//		KeyWordsStyles kws = new KeyWordsStyles(inputText, null, null);
//		System.out.println(kws.getColor());

	}

}
