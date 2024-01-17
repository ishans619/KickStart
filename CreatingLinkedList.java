public class CreatingLinkedList {
    public static void main(String [] args){
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;
        third.next = null;

        System.out.println("Linked List: ");
        PrintLinkedList(head);
    }

    public static void PrintLinkedList(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); 
    }
}
