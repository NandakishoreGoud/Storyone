package mapImplementations;

import java.util.List;
import java.util.Map;

public class TwoColor {
	public static String highlightingKeys(String inputText, Map<String, String> hashmap) {
		KeyWordsStyles kws = new KeyWordsStyles(inputText,null,null);
		for (Map.Entry<String, String> entry : hashmap.entrySet()) {
			String keyword = kws.getColor();
			String color = entry.getValue();
			inputText = inputText.replaceAll(keyword, "[" + color + "]" + keyword + "[" + color + "]");
		}
		return inputText;

	}

}
