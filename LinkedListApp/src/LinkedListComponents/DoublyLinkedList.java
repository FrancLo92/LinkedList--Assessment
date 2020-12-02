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
     
    public int searchNode(T input){
         
            Node temp = head;
            //position element is found
            int position = -1;
            boolean found = false;

            if(count !=0){
                //iterating through each element
                for(int i = 0 ; i<count ; i ++){
                    //if temp element(head to start with) equals input
                  if(temp.value.equals(input)){
                     //item found at ...
                     found = true;
                     position = i+1;
                     break;
                    }
                  // if not equal go to next element.
                    temp = temp.next;
                }
            }
            //if item is not found  return -1
            if(!found){
                System.out.println("value not found.");
                position = -1;
            }         
            return position;
        }
     
     public void deleteNodeByValue(T item) {
         
         //creating current node  = head
        Node current = head;
            
         //if list has elements
        if(count!=0)
        {     
            //if there is only one element l
            if(count==1)
            {
                //if curent element equals the item, than the head and tail will be set to hul
                if(current.value.equals(item))
                {
                    head = null;
                    tail = null;
                }
            }
            //if list has more than 1 element
            else
            {
                //while current element in list is not the tail
                while(current.next != tail )
                {
                    //check if current value is equal to item
                    if(current.value.equals(item))
                    {
                        //if equal replace current with current.next
                        current = current.next;
                        // decrease count
                        count--;
                        break;
                    }
                    //if not equal check the next element
                    current = current.next;
                }
                //if tail equals the item
                if (tail.value.equals(item))
                {
                    //set next element to null
                    current.next = null;
                    //assign current element to tail
                    tail = current;
                    // decrease count
                    count--;
                }
            }                 
        }        
    }
     
     public void TraverseForward(){
         //if list has elements
         if(count !=0){
             //if list has only 1 element
             if(count==1){
                 System.out.println(head.value);
             }
             //if list has more than one element
             else
             {
                 //create current == head
                 Node current = head;
                 //while current node is not equal to tail
                 while(current != tail)
                 {
                     //print value
                 
                     System.out.println(current.value);
                     //set current node to next element
                     current = current.next;  
                 } 
                 //print tail
                 System.out.println(tail.value);                
             }         
         }
     }
     
     public void TraverseReverse(){
         //if list has elements
         if(count !=0){
             //if list has only 1 element
             if(count==1){
                 System.out.println(head.value);
             }
             //if list has more than one element
             else
             {
                 //create current == head
                 Node current = tail;
                 //while current node is not null
                 while(current != head)
                 {
                     //print value                 
                     System.out.println(current.value);
                     //set current node to previous element
                    current = current.previous;  
                 }
                 System.out.println(head.value);               
             }         
         }
     }

    
}
