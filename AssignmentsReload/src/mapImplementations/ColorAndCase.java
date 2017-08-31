package mapImplementations;

import java.util.List;

public class ColorAndCase {
	static String keywordsHighlightingwithcases(String input, List<String> keywords) {
		for (String s : keywords) {
			String[] keys = s.split(":");
			if (keys[2].equals("capital")) {
				input = input.replace(keys[0], "[" + keys[1] + "]" + keys[0].toUpperCase() + "[" + keys[1] + "]");
			} else if (keys[2].equals("lower")) {
				input = input.replace(keys[0], "[" + keys[1] + "]" + keys[0].toLowerCase() + "[" + keys[1] + "]");
			}

		}
		return input;
	}
}
