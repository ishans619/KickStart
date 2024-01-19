import java.util.Scanner;

public class DeletingElementFromLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;
        third.next = null;

        System.out.println("Linked List: ");
        PrintLinkedList(head);

        deleteElementFromLinkedList(head);
    }

    public static void PrintLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println();
    }

    public static void deleteElementFromLinkedList(Node head) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to delete: ");
        int valueToDelete = sc.nextInt();

        Node updatedHead = deleteNode(head, valueToDelete);

        System.out.println("Linked List after deletion: ");
        PrintLinkedList(updatedHead);
        sc.close();
    }

    // Function to delete a node with a given value from the linked list
    public static Node deleteNode(Node head, int value) {
        if (head == null) {
            return null; // Empty list
        }

        if (head.data == value) {
            return head.next; // If the value to be deleted is in the head node
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next; // Remove the node with the specified value
        }

        return head;
    }
}
