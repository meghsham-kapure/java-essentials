package JavaCore.CollectionFreamework.LinkedList;

class LinkedListNode {
    int value;
    LinkedListNode nextNode;
    LinkedListNode previousNode;
    
    LinkedListNode(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    public LinkedListNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(LinkedListNode previousNode) {
        this.previousNode = previousNode;
    }
}

public class DoubleLinkedList {
    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(100);
        LinkedListNode node2= new LinkedListNode(200);
        LinkedListNode node3= new LinkedListNode(300);

        node1.setPreviousNode(null);
        node1.setNextNode(node2);

        node2.setPreviousNode(node1);
        node2.setNextNode(node3);

        node3.setPreviousNode(node2);
        node3.setNextNode(null);

        LinkedListNode currentNode = node1;

        System.out.println("Forward Traverse :");
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode=currentNode.nextNode;
        }
        
        currentNode = node3;

        System.out.println("Revese Traverse: ");
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode=currentNode.previousNode;
        }
    }
}
