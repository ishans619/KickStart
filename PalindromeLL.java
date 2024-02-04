class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLL {

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
    
    @SuppressWarnings("null")
    private static boolean isPalindrome(Node head) {
        if(head == null && head.next == null){
            return true;
        }
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
    
        Node current = slow;
        Node next;
        Node prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node right = prev;
        Node left = head;
        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public static void main(String [] args){
        int arr[] = {1,3,3,1};
        Node head = ConvertToLL(arr);
        boolean palindrome = isPalindrome(head);
        System.out.println(palindrome);

    }
    
}
