package adapter;

import java.util.EmptyStackException;
import java.util.List;

public class PushPopAdapter<T> {

	private List<T> list;

	public PushPopAdapter(List list) {
		this.list = list;
	}

	public T push(T element) {
		list.add(element);
		return element;
	}

	public T pop() {
		int length = list.size();
		if (length == 0) {
			throw new EmptyStackException();
		}

		T element = list.get(length - 1);
		list.remove(length - 1);

		return element;
	}

	public List<T> getList() {
		return list;
	}
}
