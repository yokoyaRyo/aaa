import java.util.ArrayList;
import java.util.List;

public class Queue {

	private List<Integer> q = new ArrayList<>();

	public List<Integer> getQueue(int i) {

		for(int j = 0; j< i; j++) {
			q.add(null);
		}
		return q;

	}

	//キューの末尾に要素 x を追加します。
	public void enqueue(int x) {
		q.set(0, x);
	}

	public void dequeue() {
		q.set(0, null);
	}

//	dequeue( ): //キューの先頭から要素を取り出します。
//	isEmpty( ): //キューが空かどうかを調べます。
//	isFull( ): //キューが満杯かどうかを調べます。

}
