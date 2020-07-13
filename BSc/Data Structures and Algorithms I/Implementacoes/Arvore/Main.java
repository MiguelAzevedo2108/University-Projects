package ABP;

public class Main
{
    public static void main(String [] args)
    {
        BNode<Integer> node2 = new BNode<>(2);
        BNode<Integer> node3 = new BNode<>(3);
        BNode<Integer> node4 = new BNode<>(4,node2,node3);
        BNode<Integer> node5 = new BNode<>(5);

        BTree<Integer> node1 = new BTree<>(1,node4,node5);

        node1.postOrder();
    }
}
