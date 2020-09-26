import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackImplTest {

	private MyStack<String> sut;

	@BeforeEach
	public void setup() {
		sut = new MyStack<String>();
	}

	@Test
	public void getSize_itShouldReturnStackSize() {
		//Arrange

		//Act
		int result = sut.getStackSize();
		//Verify
		assertThat(result).isEqualTo(0);
	}

	@Test
	public void pop_itShouldDecreaseSizeAndReturnPoppedItem() {
		//Arrange
		String item1 = "deneme1";
		String item2 = "deneme2";
		String item3 = "deneme3";

		sut.push(item1);
		sut.push(item2);
		sut.push(item3);

		//Act
		String returningValue = sut.pop();
		int size = sut.getStackSize();

		//Verify
		assertThat(returningValue).isEqualTo(item3);
		assertThat(size).isEqualTo(2);
	}

	@Test
	public void pop_itShouldThrowExceptionWhenStackIsEmpty() {
		//Arrange

		//Act

		//Verify
		Exception exception = Assertions.assertThrows(UnsupportedOperationException.class, sut::pop);
		assertThat("Stack is empty").isEqualTo(exception.getMessage());
	}

	@Test
	public void push_itShouldIncreaseSizeAndAddItemToTheStack() {
		//Arrange
		String item = "deneme";
		sut.push(item);

		//Act
		int size = sut.getStackSize();
		String returningValue = sut.peek();
		//Verify
		assertThat(size).isEqualTo(1);
		assertThat(returningValue).isEqualTo(item);
	}

	@Test
	public void peek_itShouldGetPeekedElement() {
		//Arrange
		String item = "deneme";
		sut.push(item);

		//Act
		String returningValue = sut.peek();

		//Verify
		assertThat(returningValue).isEqualTo(item);
	}

	@Test
	public void peek_itShouldThrowExceptionWhenStackIsEmpty() {
		//Arrange

		//Act

		//Verify
		Exception exception = Assertions.assertThrows(UnsupportedOperationException.class, sut::peek);
		assertThat("Stack is empty").isEqualTo(exception.getMessage());
	}

	@Test
	public void push_itShouldThrowExceptionWhenGivenItemIsNull() {
		//Arrange
		String item = null;

		//Act and Verify
		Exception exception = Assertions.assertThrows(NullPointerException.class, () -> sut.push(item));

	}
}
