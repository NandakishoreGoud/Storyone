package mapImplementations;

import java.util.List;

public class SingleColor {

	public static String highlightingKeys(String inputText, List<String> keyWords) {

		for (String temp : keyWords) {
			inputText = inputText.replace(temp, "[blue]" + temp + "[blue]");
		}

		return inputText;

	}

}
