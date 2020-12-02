/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListTest;

import LinkedListComponents.DoublyLinkedList;
import LinkedListComponents.Node;
import LinkedListComponents.SingleLinkedList;
import linkedlistapp.Course;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP Mini
 */
public class CourseTest {
    
        Course c1 = new Course(1,"5SDA",21.50);
        Course c2 = new Course(2,"5JAW",21.50);
        Course c3 = new Course(3,"5JAM",21.50);
        Course c4 = new Course(4,"5MITP",21.50);
        Course c5 = null;
        
        Node nc1 = new Node(c1);
        Node nc2 = new Node(c2);
        Node nc3 = new Node(c3);
        Node nc4 = new Node(c4);
        Node nc5 = new Node(c5);
        
        SingleLinkedList<Course> singleList ;
        
        DoublyLinkedList<Course> doublyList ;
       
    
    @Test
    public void addFirstLast_singleLInkedList() {

        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(nc1);          
        singleList.addLast(nc2); // nc2 is last item         
        singleList.addFirst(nc4);
        singleList.addFirst(nc3);// nc3 beacomes first item

        assertEquals(nc3, singleList.getHead());
        assertEquals(nc2, singleList.getTail());
    }
    
   
    @Test
    public void removeFirstLast_singleLInkedList() {
        
        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(nc1);          
        singleList.addLast(nc2);          
        singleList.addFirst(nc4);
        singleList.addFirst(nc3);
        
        singleList.removeFirst();// removing nc3. Now first item should be nc4
        singleList.removeLast();// removing nc2. Now last item should be nc1

        assertEquals(nc4, singleList.getHead());
        assertEquals(nc1, singleList.getTail());

    }
    
    @Test
    public void contains_singleLInkedList() {

        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(nc1);          
        singleList.addLast(nc2);          
        singleList.addFirst(nc4);
        singleList.addFirst(nc3);
        
        assertEquals(true, singleList.contains(c1));
        assertEquals(false, singleList.contains(c5));
        
    }
    
    @Test
    public void searchNode_singleLInkedList() {
        
        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(nc1);          
        singleList.addLast(nc2);          
        singleList.addFirst(nc4);
        singleList.addFirst(nc3);
        
        assertEquals(4, singleList.searchNode(c2));
    }
    
    
    @Test
    public void deleteNodeByValue_singleLInkedList() {
        
        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(nc1);          
        singleList.addLast(nc2);          
        singleList.addFirst(nc4);
        singleList.addFirst(nc3);
        
        // deleteing c2 which is the tail. Now tail should be nc1
        singleList.deleteNodeByValue(c2); 
        
        assertEquals(nc1,singleList.getTail());
    }  
    
    @Test
    public void addFirstLast_doublyLInkedList() {

        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(nc1);          
        doublyList.addLast(nc2); // nc2 is last item         
        doublyList.addFirst(nc4);
        doublyList.addFirst(nc3);// nc3 beacomes first item

        assertEquals(nc3, doublyList.getHead());
        assertEquals(nc2, doublyList.getTail());
    }
    
   
    @Test
    public void removeFirstLast_doublyLInkedList() {
        
        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(nc1);          
        doublyList.addLast(nc2);          
        doublyList.addFirst(nc4);
        doublyList.addFirst(nc3);
        
        doublyList.removeFirst();// removing nc3. Now first item should be nc4
        doublyList.removeLast();// removing nc2. Now last item should be nc1

        assertEquals(nc4, doublyList.getHead());
        assertEquals(nc1, doublyList.getTail());

    }
    
    @Test
    public void contains_doublyLInkedList() {

        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(nc1);          
        doublyList.addLast(nc2);          
        doublyList.addFirst(nc4);
        doublyList.addFirst(nc3);
        
        assertEquals(true, doublyList.contains(c1));
        assertEquals(false, doublyList.contains(c5));
        
    }
    
    @Test
    public void searchNode_doublyLInkedList() {
        
        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(nc1);          
        doublyList.addLast(nc2);          
        doublyList.addFirst(nc4);
        doublyList.addFirst(nc3);
        
        assertEquals(4, doublyList.searchNode(c2));
    }
    
    
    @Test
    public void deleteNodeByValue_doublyLInkedList() {
        
        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(nc1);          
        doublyList.addLast(nc2);          
        doublyList.addFirst(nc4);
        doublyList.addFirst(nc3);
        
        // deleteing c2 which is the tail. Now tail should be nc1
        doublyList.deleteNodeByValue(c2); 
        
        assertEquals(nc1,doublyList.getTail());
    } 
}
