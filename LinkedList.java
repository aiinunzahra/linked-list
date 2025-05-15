public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // method to insert anew node at the beginning of the list
    public void insertAtBeinginning(String content) {
        Node newNode = new Node(content);
        newNode.next = head;
        head = newNode;
        System.out.println(content + "inserted at the beginning .");
    }

    // method to insert a new node at the end of the list
    public void insertAtEnd(String content) {
        Node newNode = new Node(content);
        if (head == null) {
            head = newNode;
            System.out.println(content + "inserted at the end.");
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        System.out.println(content + "inserted at the end.");
    }

    // method to insert a new node after a given node
    public void insertAtBeinginning (Node prevNode, String content) {
        if (prevNode == null) {
            System.out.println("PrevNode cannot be null.");
            return;
        }
        Node newNode = new Node(content);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        System.out.println(content + "inserted after " + prevNode.content +".");
    }

    // Method to delete a node with a given key
    public void deleteNode (String key) {
        Node temp = head, prev = null;
      
        // If the head node itself holds the key to be deleted
        if (temp != null && temp.content.equals(key)) {
            head = temp.next; // Changed head
            return;

        }
        
        // Search for the key to be deleted, keep track of the previous node
        while (temp != null && !temp.content.equals(key)) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println(key + " not found in the list.");
            return;

        }

        // Unlink the node from linked list
        prev.next = temp.next;
        System.out.println(key + " deleted.");
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.content + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
   // Method to get a by its data (for insertAfter example)
    public Node getNodeByData(String content) {
        Node temp = head;
        while (temp != null) {
            if (temp.content.equals(content)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;

    }

    public void insertAfter(Node nodeCaca, String string) {
    }
}