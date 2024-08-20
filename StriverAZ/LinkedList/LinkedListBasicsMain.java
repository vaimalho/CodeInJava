package linkedlist.lec1;

public class LinkedListBasicsMain {

    static class Node {
        int data;
        Node next;

        Node(){
            this.data = 0;
            this.next = null;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node constructLL(int arr[]) {
        Node dummyNode = new Node();
        Node curr = dummyNode;

        for(int i=0; i< arr.length; i++){
            Node newNode = new Node(arr[i]);
            curr.next = newNode;
            curr = curr.next;
        }
        return dummyNode.next;

    }

    public int getCount(Node head) {
        if(head == null)
            return 0;

        Node curr = head;
        int result = 0;

        while(curr!=null){
            curr = curr.next;
            result++;
        }
        return result;
    }

    static boolean searchKey(int n, Node head, int key) {
        if(n==0)
            return false;

        Node curr = head;
        while(curr!=null){
            if(curr.data == key)
                return true;
            curr = curr.next;
        }
        return false;
    }

    Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        Node curr = head;

        if(head == null){
            return newNode;
        }

        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;

        return head;
    }

    public void deleteNode(Node node) {

        node.data = node.next.data;
        node.next = node.next.next;
    }


}
