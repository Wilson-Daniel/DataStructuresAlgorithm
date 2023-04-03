package DataStructuresAlgorithm.DAY_50;


import DataStructuresAlgorithm.DAY1.Node;
import DataStructuresAlgorithm.DAY_51.Delete_Without_Head;

public class LinkedList {
    static Node head;
    public static Node tail;
    public static int size;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //------------ADD-------------
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            newNode.next = null;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }
    //----------------------------------

    public static void main(String[] args) {
//        LinkedList mm = new LinkedList();
//        mm.addFirst(1);
//        mm.addFirst(2);
//        mm.addFirst(3);
//        mm.addLast(3);
//        mm.addLast(2);
//        mm.addLast(1);
//        mm.print();
//        System.out.println(mm.size);
//        System.out.println(mm.removeLast());
//        mm.removeFirst();
//        mm.print();
//        System.out.println(mm.searchItt(0));
//        System.out.println(mm.searchRec(3));
//        mm.reverse();
//        System.out.print("Reverse: ");
//        mm.print();
//
//        mm.removeNth(2);
//        System.out.print("Removing Nth position: ");
//        mm.print();
//
//        System.out.println("Checking for palindrome: "+mm.palindrome());
//        mm.addLast(3);
//        mm.addLast(2);
//        mm.addLast(1);
//        System.out.println(mm.size);
//        head = new Node(3);
//        Node temp  = new Node(2);
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = temp;
//        System.out.println("Checking for cycle: "+mm.isCycyle());
//        System.out.println("Removing cycle: ..... ");
//        mm.removeCycle();
//        System.out.println("Checking for cycle: "+mm.isCycyle());
//        mm.head = mm.MergeSort(mm.head);
//        System.out.print("Merge Sort: ");
//        mm.print();
//
//        System.out.print("ZIG-ZAG Pattern LL: ");
//        mm.ZigZag();
//        mm.print();
        //----------------------
        LinkedList mm2 = new LinkedList();
        mm2.addLast(2);
        mm2.addLast(0);
        mm2.addLast(1);
        mm2.addLast(2);
        mm2.addLast(1);
        mm2.addLast(0);
        mm2.head = mm2.MergeSort(mm2.head);
        mm2.print();
//        mm1.delNode(head);
//        mm1.print();


    }
    //-----------------------------------------------------REMOVE-----------------
    //First
    public int removeFirst(){
        if(head == null){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    //Last
    public int removeLast(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;
        for(int i=0 ; i<size-2 ; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    //-----------------------------------------------------------------------
    //---------------------------------------------------SEARCH---------------
    //iterative
    public boolean searchItt(int key){
        if(head == null){
            System.out.println("LL is empty");
            return false;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    //recursive
    public int searchRec(int key){
        return helper(head,key);
    }
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;

    }
    //------------------------------------------------------------
    //------------------------------------------REVERSE-----------
    public void reverse(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node prev =null;
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
    //------------------------------------------------------------------
    //-------------------------------------------DETECTING CYCLE----------
    public boolean isCycyle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    //---------------------------------------------REMOVING CYCLE----------
    public void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;
        while(fast!=slow){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //removing cycle
        prev.next = null;
    }

    //----------------------------------------------PRINT------------
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    //------------------------------------------Find and remove Nth node from end----
    public void removeNth(int pos){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        if(size==pos){
            head = head.next;
            return;
        }
        Node temp = head;
        int i=1;
        int finalIdx = size-pos;
        while(i<finalIdx){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }
    //-----------------------------------------------Check LL is palindrome------------
    public boolean palindrome(){
        //find Mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }
        //reverse second half
        Node prev = null;
        Node curr = slow;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //check
        Node right = prev;
        Node left = head;
        while(right!=null){
            if(right.data!= left.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    //----------------------------------------------------------------------
    //-----------------------------------MERGE SORT----------------------------
    public Node MergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //Find mid
        Node mid = findMid(head);
        //left& right merge sort
        Node rightHead = mid.next;
        mid.next=null;
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(rightHead);
        //merge
        return merge(newLeft,newRight);
    }
    public Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }
    public Node findMid(Node head){

        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //---------------------------------------------------------------------------
    //-------------------------------------------ZIG-ZAG PATTERN LIST-----------
    public void ZigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse 2nd half
        Node curr = slow;
        Node prev = null;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //merge zig-zig
        Node left = head;
        Node right = prev;
        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }
    }
    //-----------------------------------------------------------------------------
    //----------------------------------------sort 0s,1s,2d-----
    public Node sort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = sort(head);
        Node newRight = sort(rightHead);
        return mergeSort(newLeft,newRight);
    }
    public Node mergeSort(Node head1, Node head2){
        Node newMerge = new Node(-1);
        Node temp = newMerge;
        while(head1!=null && head2==null){
            if(head1.data<head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp= temp.next;
        }
        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return newMerge.next;
    }



}
