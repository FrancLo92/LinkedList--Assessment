/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListComponents;

/**
 *
 * @author HP Mini
 */
public class Node<T> {
    public T value;
    public Node next;
    public Node previous;
    
    public Node(T value)
    {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    
    public T getValue(){
        return value;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setValue(T value){
        this.value = value;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
}
