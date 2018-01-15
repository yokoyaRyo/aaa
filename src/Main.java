import java.util.List;

public class Main {

	public static void main(String[] args){
//	enqueue(x): //キューの末尾に要素 x を追加します。
//	dequeue( ): //キューの先頭から要素を取り出します。
//	isEmpty( ): //キューが空かどうかを調べます。
//	isFull( ): //キューが満杯かどうかを調べます。


		Queue queue = new Queue();

		List<Integer> q = queue.getQueue(Integer.parseInt(args[0]));
		System.out.println("q;" + q.size() + q);

		queue.enqueue(Integer.parseInt(args[1]));
		System.out.println("q;" + q.size() + q);

		queue.dequeue();
		System.out.println("q;" + q.size() + q);


	}

}
