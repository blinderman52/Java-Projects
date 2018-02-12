/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blinderman
 */
public class List {
    private Node first;
    
    public void List()
    {
        first = null;
    }
    
    public boolean isEmpty()
    {
        return (first == null);
    }
    
    public void updateList(String w)
    {
        Node current = first;
        
     
        // if list is empty or word < first word
        if(isEmpty() || first.word.compareTo(w) > 0)
        {
            insertFirst(w);
            return;
        }
        
        // if first word == word add to count
        
        if (!isEmpty() && first.word.compareTo(w) == 0 )
        {
            first.count++;
            return;
        }
        
        
        
        // search to find if word already exsists
        while (current != null && current.word.compareTo(w) < 0)
        {
            current = current.next;
            
        }
        
        // if found, add one to count
        if (current != null && current.word.compareTo(w) == 0)
        {
            current.count++;
            return;
        }
           
   
        // if not found, insert in middle
        if (current == null || current.word.compareTo(w) > 0)
        {
            insertMiddle(w);
            
            
        }
        
    }
    
    public void insertFirst(String w)
    {
            //create a new node
            Node newNode = new Node(w);
        
            // insert at the beginning
            newNode.next = first;
            first = newNode;
            
    }
    
    public void insertMiddle(String w)
    {
        Node previous = first;
        Node current = first.next;
        
        // scan list until end-of-list or new word comes before current word
        while (current != null && current.word.compareTo(w) < 0)
        {
            previous = previous.next;
            current = current.next;
        }
        
        
        // insert in middle or end
        Node newNode = new Node(w);
        previous.next = newNode;
        newNode.next = current;
        
        // found a matching word, update count
        
    }
    
    public void displayList(int total)
    {
        System.out.println("Total words: " + total);
        System.out.println("List (first --> last)");
        System.out.println("  Word         Count ");
        System.out.println("=====================");
        Node current = first;
        while(current != null)
        {
            System.out.println(current.toString());
            current = current.next;
        }
        System.out.println();
    }
    
}

