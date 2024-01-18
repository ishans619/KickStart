import java.util.Scanner;

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
        addElementAtTheBeginning(head);
    }

    public static void PrintLinkedList(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); 
        System.out.println();
    }

    public static void addElementAtTheBeginning(Node head){  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the new Node: ");
        int n = sc.nextInt();
        Node newNode = new Node(n);
        newNode.next = head;
        head = newNode;
        PrintLinkedList(head);
        sc.close();
    }
}
