class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ArrElementThroughLL{
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7};
        Node newNode = new Node(arr[4]);
        System.out.println(newNode.data);

    }

}