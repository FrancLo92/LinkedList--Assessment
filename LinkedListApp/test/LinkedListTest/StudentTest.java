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
import linkedlistapp.Enrollment;
import linkedlistapp.Student;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP Mini
 */
public class StudentTest {
    Date date = new Date();
    Student s1 = new Student("Jhon", "smith","1234567890", 1, "program2",date);        
    Student s2 = new Student("Jack", "smith","1234567890", 2, "program2",date);
    Student s3 = new Student("Frank", "White","1234567890", 3, "Program3",date);
    Student s4 = new Student("Frank", "White","1234567890", 4, "Program3",date);
    Student s5 = null;
    
    
    Node ns1 = new Node(s1);
    Node ns2 = new Node(s2);
    Node ns3 = new Node(s3);
    Node ns4 = new Node(s4);

    SingleLinkedList<Student> singleList ;

    DoublyLinkedList<Student> doublyList ;
       
    
    @Test
    public void addFirstLast_singleLInkedList() {

        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(ns1);          
        singleList.addLast(ns2); // ns2 is last item         
        singleList.addFirst(ns4);
        singleList.addFirst(ns3);// ns3 beacomes first item

        assertEquals(ns3, singleList.getHead());
        assertEquals(ns2, singleList.getTail());
    }
    
   
    @Test
    public void removeFirstLast_singleLInkedList() {
        
        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(ns1);          
        singleList.addLast(ns2);          
        singleList.addFirst(ns4);
        singleList.addFirst(ns3);
        
        singleList.removeFirst();// removing ns3. Now first item should be ns4
        singleList.removeLast();// removing ns2. Now last item should be ns1

        assertEquals(ns4, singleList.getHead());
        assertEquals(ns1, singleList.getTail());

    }
    
    @Test
    public void contains_singleLInkedList() {

        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(ns1);          
        singleList.addLast(ns2);          
        singleList.addFirst(ns4);
        singleList.addFirst(ns3);
        
        assertEquals(true, singleList.contains(s1));
        assertEquals(false, singleList.contains(s5));
        
    }
    
    @Test
    public void searchNode_singleLInkedList() {
        
        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(ns1);          
        singleList.addLast(ns2);          
        singleList.addFirst(ns4);
        singleList.addFirst(ns3);
        
        assertEquals(4, singleList.searchNode(s2));
    }
    
    
    @Test
    public void deleteNodeByValue_singleLInkedList() {
        
        singleList = new SingleLinkedList<>();
        
        singleList.addFirst(ns1);          
        singleList.addLast(ns2);          
        singleList.addFirst(ns4);
        singleList.addFirst(ns3);
        
        // deleteing c2 which is the tail. Now tail should be ns1
        singleList.deleteNodeByValue(s2); 
        
        assertEquals(ns1,singleList.getTail());
    }  
    
    @Test
    public void addFirstLast_doublyLInkedList() {

        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(ns1);          
        doublyList.addLast(ns2); // ns2 is last item         
        doublyList.addFirst(ns4);
        doublyList.addFirst(ns3);// ns3 beacomes first item

        assertEquals(ns3, doublyList.getHead());
        assertEquals(ns2, doublyList.getTail());
    }
    
   
    @Test
    public void removeFirstLast_doublyLInkedList() {
        
        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(ns1);          
        doublyList.addLast(ns2);          
        doublyList.addFirst(ns4);
        doublyList.addFirst(ns3);
        
        doublyList.removeFirst();// removing ns3. Now first item should be ns4
        doublyList.removeLast();// removing ns2. Now last item should be ns1

        assertEquals(ns4, doublyList.getHead());
        assertEquals(ns1, doublyList.getTail());

    }
    
    @Test
    public void contains_doublyLInkedList() {

        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(ns1);          
        doublyList.addLast(ns2);          
        doublyList.addFirst(ns4);
        doublyList.addFirst(ns3);
        
        assertEquals(true, doublyList.contains(s1));
        assertEquals(false, doublyList.contains(s5));
        
    }
    
    @Test
    public void searchNode_doublyLInkedList() {
        
        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(ns1);          
        doublyList.addLast(ns2);          
        doublyList.addFirst(ns4);
        doublyList.addFirst(ns3);
        
        assertEquals(4, doublyList.searchNode(s2));
    }
    
    
    @Test
    public void deleteNodeByValue_doublyLInkedList() {
        
        doublyList = new DoublyLinkedList<>();
        
        doublyList.addFirst(ns1);          
        doublyList.addLast(ns2);          
        doublyList.addFirst(ns4);
        doublyList.addFirst(ns3);
        
        // deleteing c2 which is the tail. Now tail should be ns1
        doublyList.deleteNodeByValue(s2); 
        
        assertEquals(ns1,doublyList.getTail());
    } 
}
