package DataStructuresAlgorithm.LINKED_LIST;

public class LinkedList {
    static Node head;
    static Node tail;
    static  int size;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        //STEP-1
        Node newNode = new Node(data);
        size++;
        //BASE CASE
        if(head == null){
            head = tail =  newNode;
            return;
        }
        //STEP-2
        newNode.next = head;
        //STEP-3
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    public int removeFirst(){
        if(head==null ){
            return -1;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(head==null){
            return -1;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0 ; i<size-2 ; i++){
            prev = prev.next;
        }
        int val = prev.data;
        prev.next = null;
        size--;
        tail = prev;
        return val;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(6);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(7);
        ll.add(3,5);

        ll.printList();

        System.out.println(size);
        ll.removeFirst();
        ll.printList();
        ll.removeLast();
        ll.printList();

        int idx = ll.search(6);
        int idx2 = ll.searchRecur(6,head,0);
        System.out.println(idx2);
        ll.reverse();
        ll.printList();

        System.out.println(size);
        ll.removeNth(3,ll.size);
        ll.printList();
        Node mid = ll.findMid(head);
        System.out.println(mid.data);


        System.out.println(ll.checkPalindrome());
        System.out.println(mergeSort(head));
    }
    //merge sort on linked list
    public static Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid = getMid(head);
        Node rigthHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rigthHead);
        return merge(newLeft,newRight);
    }
    public static Node merge(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1!=null && head1!=null){
            if(head1.data<head2.data){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }else{
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        while(head1!=null){
            temp.next = head1;
            temp =temp.next;
            head1 = head1.next;
        }
        while(head2!=null){
            temp.next = head2;
            temp = temp.next;
            head2 = head.next;
        }
        return mergedLL.next;
    }
    private static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //removing nth node form the last
    public void removeNth(int n,int size){
        if(head == null || n>size){
            System.out.println("Invalid removal!!");
            return;
        }
        Node temp = head;
        for(int i=1 ; i<=size-n-1 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public int search(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int searchRecur(int key,Node temp,int idx){
        if(temp==null){
            return -1;
        }
        if(temp.data==key){
            return idx;
        }
        return searchRecur(key,temp.next,idx+1);
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    //CHECK IF LL IS PALINDROME
    //SLOW-FAST POWER ---- TO FIND MIDDLE OF THE LINKED LIST
    public static Node findMid(Node head){
        Node slow  = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static boolean checkPalindrome(){
        //find Mid
        Node mid = findMid(head);
        //Reverse other half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        //check for palindrome
        while(right!= null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

}