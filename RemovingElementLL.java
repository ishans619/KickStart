class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class RemovingElementLL {

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

    private static Node removeElements(Node head, int val) {
        while (head != null && head.data == val) {
           head = head.next;
       }
       
       Node current = head;
       while (current != null && current.next != null) {
           if (current.next.data == val) {
               current.next = current.next.next;
           } else {
               current = current.next;
           }
       }
       
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
        int arr[] = {1,2,6,3,4,5,6};
        Node head = ConvertToLL(arr);
        print(head);
        System.out.println();
        Node removed = removeElements(head, 6);
        print(removed);

    }
    
}
