package LinkedLists;

public class Main
{
    public static void main (String [] args) throws InvalidNodeException
    {

		/* Testes SingleNodes

		SingleNode <Integer> node1 = new SingleNode<>();

		System.out.println(node1.element());

		SingleNode <Integer> node2 = new SingleNode<>(2);

		System.out.println(node2.element());

		SingleNode <Integer> node3 = new SingleNode<>(3,node2);

		System.out.println(node3.getNext().element());
		*/



		/*Testes Iterator

		SingleNode <Integer> node = new SingleNode<>();
		SingleNode <Integer> node1 = new SingleNode<>(1,node);
		SingleNode <Integer> node2 = new SingleNode<>(2,node1);
		SingleNode <Integer> node3 = new SingleNode<>(3,node2);

		LinkedListIterator <Integer> iterator = new LinkedListIterator<>(node3);

		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		 */


		/*Testes Add & Remove

		LinkedList <Integer> list = new LinkedList<>();
		list.add(0, 1);
		list.add(1,2);
		list.add(2,3);
		list.add(3,4);
		list.add(4,5);
		list.add(1, 10);

		System.out.println("2 elemento : " + list.get(1));

		System.out.print(list.toString());

		System.out.print("size : " + list.size());
		*/
    }
}
