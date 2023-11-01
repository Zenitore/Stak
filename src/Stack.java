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


}