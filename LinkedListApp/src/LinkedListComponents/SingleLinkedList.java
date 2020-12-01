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
public class SingleLinkedList <T> {
    Node<T> head;
    Node<T> tail;
    int count = 0;

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
    
    public void addFirst(Node<T> node){
        //save off the head node so we don't loose it
        Node<T> temp = head;
        // point head to new node
        head = node;
        //insert the rest of the list behind the head
        head.next = temp;
        count++;
        //if the list has only 1 element then Head and Tail should
        //both point to the new node
        if(count == 1)
        {
            tail = head;
        }
    }
    
    public void addLast(Node<T> node){
        
        if(count == 0)// no nodes
        {
            head = node;
        }
        else
        {
            tail.next = node;
        }
        tail = node;
        count++;
    }
    
    public void removeFirst()
    {
        // if list has elements
        if (count!=0)
        {
            // head becomes the next element 
            head = head.next;
            // decreas count by 1
            count--;
            //if list is hempy
            if (count == 0)
            {
                // tail is null
                tail = null;
            }
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
    
    public void removeLast(){
        //if list has elements
        if(count!=0)
        {
            //if there is only one element than the head and tail will be set to hull
            if(count==1)
            {
                head = null;
                tail = null;
            }
            //if list has more than 1 element
            else
            {
                // create node and assign to it the list head
                Node<T> current = head;
                //while current element in list is not the tail, go to the next element
                while(current.next != tail)
                {
                    current = current.next;
                }
                //once tail is found, set current element to null and assign it to the tail
                current.next = null;
                tail = current;
            }
            // decrease count
            count--;
        }
    }
    
    
    
    
}
