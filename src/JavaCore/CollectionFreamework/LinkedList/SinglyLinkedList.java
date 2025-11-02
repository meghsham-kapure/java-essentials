package JavaCore.CollectionFreamework.LinkedList;

class LLNode {
    int value;
    LLNode nextLLNode;
    
    LLNode(int value, LLNode nextLLNode){
        this.value=value;
        this.nextLLNode = nextLLNode;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + ", nextNode=" + nextLLNode + "]";
    }
    
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LLNode LLNode5 = new LLNode(50, null);
        LLNode LLNode4 = new LLNode(40, LLNode5);
        LLNode LLNode3 = new LLNode(30, LLNode4);
        LLNode LLNode2 = new LLNode(20, LLNode3);

        LLNode currentLLNode = new LLNode(10, LLNode2);
   
        while (currentLLNode != null) {
            System.out.println(currentLLNode.value);
            currentLLNode = currentLLNode.nextLLNode;
        }
        
    }
}
