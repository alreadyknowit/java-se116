
package DataStructure;

public class LinkedList {
   Node head;
   
   public void insert(String name)
   {   
      Node node = new Node();
      node.name=name;
      node.next=null;
      
       // if there is only one node so...
    if(head==null)
    {
        head=node;
    }
   
    //if there is more than one node
    else
    {
        Node n=head;
        
        while(n.next!=null)
        {
            n=n.next;
        }
        n.next=node;
    }
   
   }
   public void insertAtStart(int data)
   {
       Node node = new Node();
       Node head;
       node.data=data;
       node.next=node;
       head=node;
      
       
   }
   
    public void show()
    {
     Node node=head;
     
     while(node.next!=null)
     {
         System.out.println(node.name);
         node=node.next;
     }
        System.out.println(node.name);
      node.next=node;
    }
    
   
}

    
