import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordCountTest {

	private final WordCount sut = new WordCount();

	@Test
	public void getWordCount_shouldReturnCorrectWordCount(){
		//Arrange
		String text  = "I'm";

		//Act
		int result = sut.getWordCount(text);

		//Assert
		assertThat(result).isEqualTo(text.split(" ").length);
	}
	@Test
	public void getWordCount_shouldReturnZeroWhenNullTextGiven(){
		//Arrange

		//Act
		int result = sut.getWordCount(null);

		//Assert
		assertThat(result).isEqualTo(0);
	}
	@Test
	public void getWordCount_shouldReturnZeroWhenEmptyTextGiven(){
		//Arrange

		//Act
		int result = sut.getWordCount("");

		//Assert
		assertThat(result).isEqualTo(0);
	}
	@Test
	public void getWordCount_shouldReturnZeroWhenDuplicateTextGivenInTheText(){
		//Arrange
		String text  = "text text";

		//Act
		int result = sut.getWordCount(text);

		//Assert
		assertThat(result).isEqualTo(1);
	}
	@Test
	public void getWordCount_shouldReturnCorrectResultWhenDuplicateLowerAndUpperCaseStringGivenInTheText(){
		//Arrange
		String text  = "text Text";

		//Act
		int result = sut.getWordCount(text);

		//Assert
		assertThat(result).isEqualTo(1);
	}
	@Test
	public void getWordCount_shouldReturnCorrectResultWhenMultipleSpacesGivenInTheText(){
		//Arrange
		String text  = "    text      Text      ";

		//Act
		int result = sut.getWordCount(text);

		//Assert
		assertThat(result).isEqualTo(1);
	}
}
