/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linklist;

public class LinkList {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

  
    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }


    static void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    static void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static boolean search(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                return true;
            }

            current = current.next;
        }

        return false;
    }


    static void delete(int data) {

        if (head == null) {
            return;
        }

       
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    public static void main(String[] args) {

        insert(101);
        insert(102);
        insert(103);
        insert(104);
        insert(105);

      
        System.out.println("Initial:");
        display();

       
        insertBeginning(100);

        System.out.println("\nInsert 100:");
        display();


        System.out.println("\nSearch 103:");

        if (search(103)) {
            System.out.println("103 found.");
        } else {
            System.out.println("103 not found.");
        }

     
        delete(103);

        System.out.println("\nDelete 103:");
        display();
    }
}
