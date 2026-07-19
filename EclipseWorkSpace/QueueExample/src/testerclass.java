
public class testerclass
{

	public static void main(String[] args)
	{
		System.out.println("Isabella Eaton test");
		MyLinkedQueue<String> stringQueue= new MyLinkedQueue();
		System.out.println("Test isEmpty():"+ stringQueue.isEmpty());
		stringQueue.enqueue("First Item");
		System.out.println("Test isEmpty() after adding an item:"+ stringQueue.isEmpty());
		System.out.println("Test dequeue:"+ stringQueue.dequeue());
		System.out.println("Test isEmpty() after dequeuing an item:"+ stringQueue.isEmpty());

	}

}
