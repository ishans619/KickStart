class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class CycleInLL {

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

    private static boolean cycleInLL(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String [] args){
        int arr[] = {3,2,0,-4};
        Node head = ConvertToLL(arr);
        head.next.next.next.next = head.next;
        boolean cycLL = cycleInLL(head);
        System.out.println(cycLL);
    }
    
}
