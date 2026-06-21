//Isabella Eaton
//CS2: In class exercise 2 

public class NodeExercise {
    public static void main(String[] args) {
        // Task 1: Create 3 nodes that hold the strings: "Apple", "Banana", and "Cherry" respectively.
        Node<String> node1 = new Node<>("Apple");
        Node<String> node2 = new Node<>("Banana");
        Node<String> node3 = new Node<>("Cherry");

        // Task 2: Link the three nodes together in order of node1 -> node2 -> node3 using the setNextNode method.
        node1.setNextNode(node2);
        node2.setNextNode(node3);

        // Task 3: Traverse the chain and display the data of each node.
        System.out.print("After Initalizing nodes and creating link: ");
        Node<String> currentNode = node1;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println();

        // Task 4: Update the data in node2 from "Banana" to "Blueberry".
        node2.setData("Blueberry");

        // Task 5: Traverse the chain again to display the updated list.
        System.out.print("Updarted list: ");
        currentNode = node1; // Reset pointer to the start
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println();

        // Task 6: Insert a new node "Catnip" between node2 and node3.
        Node<String> newNode = new Node<>("Catnip");
        newNode.setNextNode(node3); // Point the new node to node3 first
        node2.setNextNode(newNode); // Point node2 to the new node

        // Task 7: Traverse the chain again to display the last node in the chain.
        currentNode = node1; // Reset pointer to the start
        // Loop until currentNode.getNextNode() is null,produces the last node
        while (currentNode != null && currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        
        if (currentNode != null) {
            System.out.println("Last Node: " + currentNode.getData());
        }
    }
}
