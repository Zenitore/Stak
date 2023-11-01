import com.sun.istack.internal.NotNull;

public class Stack<T> {

    StackNode<T> sizeNode = new StackNode<>();
    StackNode<T> currentNode = new StackNode<>(null, sizeNode);
    public Stack(){
    }

    public void push(T element){
        if (currentNode.getValue() != null){
            StackNode<T> createdNode = new StackNode<>(element, currentNode);
            currentNode = createdNode;
        }
        else{
            currentNode.setValue(element);
        }
    }    //add an element

    public T pop(){
        StackNode<T> deletedNode = currentNode;
        currentNode = currentNode.getParentNode();
        return deletedNode.getValue();
    }                 //remove and return the top element

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size(){
        StackNode<T> localCurrentNode = currentNode;
        int counter = 0;
        while (localCurrentNode.getParentNode() != sizeNode){
            counter++;
            localCurrentNode = localCurrentNode.getParentNode();
        }
        return counter;
    }

    public T peek(){
        return currentNode.getValue();
    }                //look at the top element without removing


}