//package JavaCore.CollectionFreamework.LinkedList;
//
//class Node {
//    private int value;
//    private LinkedListNode nextNode;
//    private LinkedListNode previousNode;
//    private boolean isVisited = false;
//
//    Node(int value) {
//        this.value = value;
//
//
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//
//    public LinkedListNode getNextNode() {
//        return nextLLNode;
//    }
//
//    public void setNextNode(LinkedListNode nextNode) {
//        this.nextLLNode = nextNode;
//    }
//
//    public LinkedListNode getPreviousNode() {
//        return previousNode;
//    }
//
//    public void setPreviousNode(LinkedListNode previousNode) {
//        this.previousNode = previousNode;
//    }
//
//    public boolean isVisited() {
//        return isVisited;
//    }
//
//    public void setVisited(boolean isVisited) {
//        this.isVisited = isVisited;
//    }
//
//
//}
//
//public class CircularLinkedList {
//    public static void main(String[] args) {
//        LinkedListNode node1 = new LinkedListNode(100);
//        LinkedListNode node2 = new LinkedListNode(200);
//        LinkedListNode node3 = new LinkedListNode(300);
//
//
//
//        node1.setPreviousNode(node3);
//        node1.setNextNode(node2);
//
//        node2.setPreviousNode(node1);
//        node2.setNextNode(node3);
//
//        node3.setPreviousNode(node2);
//        node3.setNextNode(node1);
//
//        LinkedListNode currentNode = node2;
//
//        System.out.println("Forward Traverse :");
//        while (currentNode.isVisited() == false) {
//            System.out.println(currentNode.getValue());
//            currentNode.setVisited(true) ;
//            currentNode = currentNode.getNextNode();
//
//        }
//
//        currentNode = node2;
//
//        System.out.println("Revese Traverse: ");
//        while (currentNode.isVisited() == true) {
//            System.out.println(currentNode.getValue());
//            currentNode.setVisited(false);
//            currentNode = currentNode.getPreviousNode();
//        }
//    }
//}
