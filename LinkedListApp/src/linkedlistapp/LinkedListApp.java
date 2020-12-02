/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistapp;

import LinkedListComponents.DoublyLinkedList;
import LinkedListComponents.Node;
import LinkedListComponents.SingleLinkedList;
import java.util.Date;

/**
 *
 * @author HP Mini
 */
public class LinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
        SingleLinkedList<Course> courseSingleList = new SingleLinkedList<>();
        
        courseSingleList.addFirst(nc1);          
        courseSingleList.addLast(nc2); // nc2 is last item         
        courseSingleList.addFirst(nc4);
        courseSingleList.addFirst(nc3);// nc3 beacomes first item
        
        DoublyLinkedList<Course> courseDoublyList = new DoublyLinkedList<>();
        
        courseDoublyList.addFirst(nc1);          
        courseDoublyList.addLast(nc2); // nc2 is last item         
        courseDoublyList.addFirst(nc4);
        courseDoublyList.addFirst(nc3);// nc3 beacomes first item
        
        
        System.out.println("Course Class Single Linked List Traverse Forward");
        courseSingleList.TraverseForward();        
        System.out.println("\nCourse Class Doubly Linked List Traverse Forward");
        courseDoublyList.TraverseForward();
        System.out.println("\nCourse Class Doubly Doubly List Traverse Reverse");
        courseDoublyList.TraverseReverse();
        
        
        Enrollment e1 = new Enrollment(1, new Date(),"D","S1");
        Enrollment e2 = new Enrollment(2, new Date(),"S","S1");
        Enrollment e3 = new Enrollment(3, new Date(),"P","S2");
        Enrollment e4 = new Enrollment(4, new Date(),"P","S2");
        Enrollment e5 = null;

        Node ne1 = new Node(e1);
        Node ne2 = new Node(e2);
        Node ne3 = new Node(e3);
        Node ne4 = new Node(e4);

        SingleLinkedList<Enrollment> enrollmentSingleList = new SingleLinkedList<>();
        enrollmentSingleList.addFirst(ne1);          
        enrollmentSingleList.addLast(ne2); // ne2 is last item         
        enrollmentSingleList.addFirst(ne4);
        enrollmentSingleList.addFirst(ne3);// ne3 beacomes first item
       
        DoublyLinkedList<Enrollment> enrollmentDoublyList = new DoublyLinkedList<>();
        enrollmentDoublyList.addFirst(ne1);          
        enrollmentDoublyList.addLast(ne2); // ne2 is last item         
        enrollmentDoublyList.addFirst(ne4);
        enrollmentDoublyList.addFirst(ne3);// ne3 beacomes first item
        
        System.out.println("\n\nEnrollment Class Single Linked List Traverse Forward");
        enrollmentSingleList.TraverseForward();        
        System.out.println("\nEnrollment Class Doubly Linked List Traverse Forward");
        enrollmentDoublyList.TraverseForward();
        System.out.println("\nEnrollment Class Doubly Doubly List Traverse Reverse");
        enrollmentDoublyList.TraverseReverse();
        
        
        Student s1 = new Student("Jhon", "smith","1234567890", 1, "program2",new Date());        
        Student s2 = new Student("Jack", "smith","1234567890", 2, "program2",new Date());
        Student s3 = new Student("Frank", "White","1234567890", 3, "Program3",new Date());
        Student s4 = new Student("Frank", "White","1234567890", 4, "Program3",new Date());
        Student s5 = null;


        Node ns1 = new Node(s1);
        Node ns2 = new Node(s2);
        Node ns3 = new Node(s3);
        Node ns4 = new Node(s4);

        SingleLinkedList<Student> studentSingleList = new SingleLinkedList<>();
        
        studentSingleList.addFirst(ns1);          
        studentSingleList.addLast(ns2); // ns2 is last item         
        studentSingleList.addFirst(ns4);
        studentSingleList.addFirst(ns3);// ns3 beacomes first item

        DoublyLinkedList<Student> studentDoublyList =new DoublyLinkedList<>();
        studentDoublyList.addFirst(ns1);          
        studentDoublyList.addLast(ns2); // ns2 is last item         
        studentDoublyList.addFirst(ns4);
        studentDoublyList.addFirst(ns3);// ns3 beacomes first item
        
        System.out.println("\n\nStudent Class Single Linked List Traverse Forward");
        studentSingleList.TraverseForward();        
        System.out.println("\nStudent Class Doubly Linked List Traverse Forward");
        studentDoublyList.TraverseForward();
        System.out.println("\nStudent Class Doubly Doubly List Traverse Reverse");
        studentDoublyList.TraverseReverse();
        
        

        
        
    }
    
    public static void printList(Node node){
        while(node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
