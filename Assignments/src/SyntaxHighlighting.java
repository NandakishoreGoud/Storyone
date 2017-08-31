/*import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SyntaxHighlighting {

	 static String keywordsHighlighting(String input, String key) {

		List<String> inputlistTokens = new ArrayList<String>();
		List<String> keytokenslist = new ArrayList<String>();
		List<String> resultlist = new ArrayList<>();

		StringTokenizer st1 = new StringTokenizer(input, " ");
		StringTokenizer st2 = new StringTokenizer(key, " ");
		while (st1.hasMoreTokens()) {
			inputlistTokens.add(st1.nextToken());
		}
		while (st2.hasMoreTokens()) {
			keytokenslist.add(st2.nextToken());
		}
		for (int i = 0; i < inputlistTokens.size(); i++) {
			if (keytokenslist.contains(inputlistTokens.get(i))) {
				for (int j = 0; j < keytokenslist.size(); j++) {
					if (inputlistTokens.get(i).equals(keytokenslist.get(j))) {
						resultlist.add("[blue]" + inputlistTokens.get(i) + "[blue]");
					}
				}
			} else {
				resultlist.add(inputlistTokens.get(i));
			}

		}
		String output="";
		for (String temp : resultlist) {
			output=temp;
			System.out.print(output + " ");
		}
		return output;

	}
}
*/






import java.util.ArrayList;
import java.util.List;

public class SyntaxHighlighting {
	public static String keyWordHighlighter(String inputText, List<String> keyWordList) {
		for (String keyword : keyWordList) {
			inputText = inputText.replace(keyword, "[blue]" + keyword + "[blue]");
		}
		return inputText;
	}
}