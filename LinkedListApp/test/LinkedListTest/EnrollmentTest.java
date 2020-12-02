/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListTest;

import LinkedListComponents.DoublyLinkedList;
import LinkedListComponents.Node;
import LinkedListComponents.SingleLinkedList;
import java.util.Date;
import linkedlistapp.Course;
import linkedlistapp.Enrollment;
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
public class EnrollmentTest {
    
    Enrollment e1 = new Enrollment(1, new Date(),"D","S1");
    Enrollment e2 = new Enrollment(2, new Date(),"S","S1");
    Enrollment e3 = new Enrollment(3, new Date(),"P","S2");
    Enrollment e4 = new Enrollment(4, new Date(),"P","S2");
    Enrollment e5 = null;
    
    Node ne1 = new Node(e1);
    Node ne2 = new Node(e2);
    Node ne3 = new Node(e3);
    Node ne4 = new Node(e4);

    SingleLinkedList<Enrollment> singleList ;

    DoublyLinkedList<Enrollment> doublyList ;
       
    
    @Test
    public void addFirstLast_singleLInkedList() {

        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(ne1);          
        singleList.addLast(ne2); // ne2 is last item         
        singleList.addFirst(ne4);
        singleList.addFirst(ne3);// ne3 beacomes first item

        assertEquals(ne3, singleList.getHead());
        assertEquals(ne2, singleList.getTail());
    }
    
   
    @Test
    public void removeFirstLast_singleLInkedList() {
        
        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(ne1);          
        singleList.addLast(ne2);          
        singleList.addFirst(ne4);
        singleList.addFirst(ne3);
        
        singleList.removeFirst();// removing ne3. Now first item should be ne4
        singleList.removeLast();// removing ne2. Now last item should be ne1

        assertEquals(ne4, singleList.getHead());
        assertEquals(ne1, singleList.getTail());

    }
    
    @Test
    public void contains_singleLInkedList() {

        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(ne1);          
        singleList.addLast(ne2);          
        singleList.addFirst(ne4);
        singleList.addFirst(ne3);
        
        assertEquals(true, singleList.contains(e1));
        assertEquals(false, singleList.contains(e5));
        
    }
    
    @Test
    public void searchNode_singleLInkedList() {
        
        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(ne1);          
        singleList.addLast(ne2);          
        singleList.addFirst(ne4);
        singleList.addFirst(ne3);
        
        assertEquals(4, singleList.searchNode(e2));
    }
    
    
    @Test
    public void deleteNodeByValue_singleLInkedList() {
        
        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(ne1);          
        singleList.addLast(ne2);          
        singleList.addFirst(ne4);
        singleList.addFirst(ne3);
        
        // deleteing c2 which is the tail. Now tail should be ne1
        singleList.deleteNodeByValue(e2); 
        
        assertEquals(ne1,singleList.getTail());
    }  
    
    @Test
    public void addFirstLast_doublyLInkedList() {

        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(ne1);          
        doublyList.addLast(ne2); // ne2 is last item         
        doublyList.addFirst(ne4);
        doublyList.addFirst(ne3);// ne3 beacomes first item

        assertEquals(ne3, doublyList.getHead());
        assertEquals(ne2, doublyList.getTail());
    }
    
   
    @Test
    public void removeFirstLast_doublyLInkedList() {
        
        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(ne1);          
        doublyList.addLast(ne2);          
        doublyList.addFirst(ne4);
        doublyList.addFirst(ne3);
        
        doublyList.removeFirst();// removing ne3. Now first item should be ne4
        doublyList.removeLast();// removing ne2. Now last item should be ne1

        assertEquals(ne4, doublyList.getHead());
        assertEquals(ne1, doublyList.getTail());

    }
    
    @Test
    public void contains_doublyLInkedList() {

        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(ne1);          
        doublyList.addLast(ne2);          
        doublyList.addFirst(ne4);
        doublyList.addFirst(ne3);
        
        assertEquals(true, doublyList.contains(e1));
        assertEquals(false, doublyList.contains(e5));
        
    }
    
    @Test
    public void searchNode_doublyLInkedList() {
        
        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(ne1);          
        doublyList.addLast(ne2);          
        doublyList.addFirst(ne4);
        doublyList.addFirst(ne3);
        
        assertEquals(4, doublyList.searchNode(e2));
    }
    
    
    @Test
    public void deleteNodeByValue_doublyLInkedList() {
        
        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(ne1);          
        doublyList.addLast(ne2);          
        doublyList.addFirst(ne4);
        doublyList.addFirst(ne3);
        
        // deleteing c2 which is the tail. Now tail should be ne1
        doublyList.deleteNodeByValue(e2); 
        
        assertEquals(ne1,doublyList.getTail());
    } 
    
}
