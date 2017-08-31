import java.util.ArrayList;
import java.util.List;

////////former code

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {

		String inputtext, inputkey;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the input text");
		inputtext = br.readLine();
		System.out.println("enter the match key seperated with a space ");
		inputkey = br.readLine();
		SyntaxHighlighting.keywordsHighlighting(inputtext, inputkey);
		//Syntaxhighlightinghavingdifferentcolors.keywordsHighlighting1(inputtext, inputkey);
	}
}
*/

/////////syntax1
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("enter the input text");
    	String input = br.readLine();
        List<String> keyWordList = new ArrayList<String>();
        System.out.println("enter keywords");
        keyWordList.add(br.readLine());
        keyWordList.add(br.readLine());
        keyWordList.add(br.readLine());
        keyWordList.add(br.readLine());
        keyWordList.add(br.readLine());
    System.out.println(SyntaxHighlighting.keyWordHighlighter(input, keyWordList));

    }
}
*/

////////syntax2
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String input = "if we write a program and compile it, then we can run the program to get output";
		Map<String, String> keywordColor = new HashMap<>();
		keywordColor.put("as", "blue");
		keywordColor.put("if", "purple");
		keywordColor.put("and", "red");
		keywordColor.put("then", "green");
		keywordColor.put("when", "blue");
		System.out.println(Syntaxhighlightinghavingdifferentcolors.keyWordHighlighter(input, keywordColor));

	}
}


///////syntax3

/*public class Main {
	public static void main(String[] args) {
		String input = "if we write a program and compile it, then we can run the program to get output";
		List<String> keywords=new ArrayList();
		keywords.add("as:blue:capital");
		keywords.add("and:red:capital");
		keywords.add("if:green:lower");
		syntaxhighightingandcasechange.keywordsHighlightingwithcases(input,keywords);
		
		
	}
	}*/