public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insertAtEnd("Caca");
        list.insertAtEnd("Nana");
        list.insertAtEnd("Beni");
        list.insertAtEnd("Banu");
    
    // Print the list
    System.out.println("Linked List after insertion:");
    list.printList(); // Expeceted: Caca -> Nana -> Beni -> Banu -> null

    // Insert after a specific node
    Node nodeCaca  = list.getNodeByData("Caca");
    if (nodeCaca != null) {
        list.insertAfter(nodeCaca, "denis");
    } 

    // Print the list aftetr insertAfter
    System.out.println("\nLinked list after inserting denis after Caca:");
    list.printList(); // Expected: Caca -> denis -> Nana -> Beni -> Banu -> null

    // Delete a node-existing node
    list.deleteNode("nana");

    // Print the list after deletion
    System.out.println("\nLinked list after deleting nana:");
    list.printList(); // Expected: Caca -> denis -> Beni -> Banu -> null

    // Delete a non-existing node
    list.deleteNode("dini");

    //Print the list after to delete non-existing node
    System.out.println("\nLinked list after trying to delete to dini:");
    list.printList(); // Expected: Caca -> denis -> Beni -> Banu -> null
     }
}

