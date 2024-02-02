class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class DeletionAndInsertionLL{

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
    
    private static Node removeHead(Node head){
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    
    }

    private static Node removeTail(Node head){
        if(head == null){
            return head;
        }
        
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // private static int LenghtLL(Node head){
    //     int count = 0;
    //     Node temp = head;
    //     while(temp != null){
    //         temp = temp.next;
    //         count++;
    //     }
    //     return count;
    // }

    private static Node randomDelete(Node head, int k){
        if(head == null){
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node valueDelete(Node head, int k){
        if(head == null){
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String [] args){
        int arr[] = {2,3,4,5,6,7,8};
        Node head = ConvertToLL(arr);
        print(head);
        System.out.println();
        Node randomDel = randomDelete(head, 4);
        print(randomDel);
        System.out.println();
        Node valDel = valueDelete(head, 6);
        print(valDel);
        System.out.println();
        head = removeHead(head);
        print(head);
        System.out.println();
        head = removeTail(head);
        print(head);
    }
}