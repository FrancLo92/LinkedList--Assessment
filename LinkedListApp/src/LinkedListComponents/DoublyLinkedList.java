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
public class DoublyLinkedList<T>{
    
    Node<T> head;
    Node<T> tail;
    int count = 0;

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
    
     public void addFirst(Node<T> node){
        Node<T> temp = head;
        head = node;
        head.next = temp;
        
        if(count == 0)
        {
           // if the list is empty, the head
            // and tail should point to the new node
            tail = head;
        }
        else
        {
            //if not empty temp.previous was null now is head
            temp.previous = head;
        }
        count++;
    }
     
     public void addLast(Node<T> node)
     {
         if (count == 0)
         {
             //if list is empty last element would be the head
             head = node;
         }
         else
         {
             //set element after tail to the node parameter
             tail.next = node;
             //set node. previous to the tail
             node.previous = tail;
         }
         //assign node to the list tail
         tail = node;
         // increase list count
         count++;
     }
     
     public void removeFirst(){
         if (count!=0)
         {
             //if list is not empty
             //repleace head with the next element
             head = head.next;
             ///decrease count
             count--;
         }
         else
         {
             //set first element to null
             head.previous = null;
         }
     }
     
     public void removeLast(){
         if (count!=0)
         {
             //if list has 1 element
             if(count == 1)
             {
                 //set both head and tail to null
                 head = null;
                 tail = null;
             }
             else
             {
                 //if list has more than 1 element
                 //set tail previous and next to null
                 tail.previous .next = null;
                 //set tail to tail.previous (null)
                 tail = tail.previous;
             }
             //decrease list count
             count--;
         }
     }
     
     public boolean contains(T item){
        // create SingleNode current and assign to it the list head
        Node<T> current = head;
        //while there is an element
        while(current != null)
        {
            // if the current value equals the item we are looking for return true
            if(current.value.equals(item))
            {
                return true;
            }
            // if not equal current becomes the next element in the list
            current = current.next;
        }
        //if not found return false
        return false;            
    }
    
}
