import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {

	private List<T> stack;

	public MyStack() {
		stack = new ArrayList<>();
	}

	public int getStackSize() {
		return stack.size();
	}

	public void push(T deneme) {
		stack.add(deneme);
	}

	public String pop() {
		checkSize();
		return (String) stack.remove(getStackSize()-1);
	}

	public String peek() {
		checkSize();
		return (String) stack.get(getStackSize()-1);
	}

	private void checkSize(){
		if(stack.size() == 0){
			throw new UnsupportedOperationException("Stack is empty");
		}
	}
}
