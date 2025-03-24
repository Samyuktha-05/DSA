package DAY2;

public class linked_node {
	    Node head;
	    class Node {
	        int data;
	        Node next;

	        Node(int val) {
	            data = val;
	            next = null;
	        }
	    }
	    public linked_node() {
	        head = null;
	    }  
	    public void insertAtBegin(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            newNode.next = temp;
	            head = newNode;
	        }
	        }
	    public void display() {
	        Node temp = head;
	       
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    } 
	    public void insertAtAnyPos(int pos, int val) {
	        Node newNode = new Node(val);     
	                if (pos == 1) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }
	        Node temp = head;       
	        for (int i = 1; i < pos - 1; i++) {
	            
	            temp = temp.next;
	        }        
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }
	    public void deleteAtBegin() {
	    	head=head.next;
	    }
public void deleteAtPosition(int delpos) {
	Node temp=head;
	Node dtemp=null;
	 for (int i = 0; i < delpos - 1; i++) {
         dtemp=temp;
         temp = temp.next;
	 }
	dtemp.next=temp.next;
}

	    
	}


