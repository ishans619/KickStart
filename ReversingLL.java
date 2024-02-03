class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ReversingLL {
    
    private static Node ConvertToLL(int [] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static Node reverseLL(Node head){
        Node current = head;
        Node next = null;
        Node prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    private static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String [] args){
        int arr[] = {3,6,12,78,23,65};
        Node head = ConvertToLL(arr);
        print(head);
        System.out.println();
        Node revLL = reverseLL(head);
        print(revLL);

    }
}
