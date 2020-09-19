import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordCount {

	public int getWordCount(String text) {
		int result = 0;

		if(text == null || text.length() == 0){
			return result;
		}

		text = removePunctuations(text);
		text = toLowerCaseText(text);

		String[] words = text.split(" ");
		Set<String> wordSet = new HashSet<>(Arrays.asList(words));

		return wordSet.size();
	}

	private String removePunctuations(String text) {
		return text.replaceAll("\\p{P}", "");
	}

	private String toLowerCaseText(String text) {
		return text.toLowerCase();
	}
}
