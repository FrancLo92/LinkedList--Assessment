/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistapp;

import LinkedListComponents.Node;

/**
 *
 * @author HP Mini
 */
public class LinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node first = new Node(3);
        Node middle = new Node(5);
        first.setNext(middle);
        Node last = new Node(7);
        middle.setNext(last);
        
        printList(first);
    }
    
    public static void printList(Node node){
        while(node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
