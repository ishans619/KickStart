class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class DeletionAndInsertionLL2 {
    
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

    private static Node insertHead(Node head){
         Node temp = new Node(1);
         temp.next = head;
         return temp;
    }    
    
    private static Node insertTail(Node head){
        Node newNode = new Node(14);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        return head;
    }

    private static Node atRandomPos(Node head, int k){
        Node newNode = new Node(9);
        int count = 0;
        Node temp = head;
        while(temp.next != null){
            count++;
            if(count == k){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node insertAtValue(Node head, int val){
        Node newNode = new Node(3);
        Node temp = head;
        while(temp.next != null){
            if(temp.data == val){
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
        if(temp.next == null && temp.data == val){
            newNode.next = null;
            temp.next = newNode;
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
       int arr[] = {2,4,6,8,10,12};
       Node head = ConvertToLL(arr);
       print(head);
       System.out.println();
       Node isrtHead = insertHead(head);
       print(isrtHead);
       System.out.println(); 
       Node isrtTail = insertTail(isrtHead);
       print(isrtTail);
       System.out.println();
       Node atranpos = atRandomPos(isrtTail, 5);
       print(atranpos);
       System.out.println();
       Node isrtatval = insertAtValue(atranpos, 2);
       print(isrtatval);
       System.out.println();
    }
}
