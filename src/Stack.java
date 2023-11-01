import com.sun.istack.internal.NotNull;

public class Stack<T> {

    StackNode<T> currentNode = new StackNode<>();
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
        return currentNode.getValue() == null && currentNode.getParentNode().equals(null);
    }


    public int size(){

    }
//T peek()                //look at the top element without removing


}