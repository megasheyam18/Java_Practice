import java.util.Stack;
public class linkedlistadd{
    static class node{
        int data;
        node next;

        
    }
    public node head;
    public node tail;
    public int size;
    public void addLast(int item)
    {
        node nn=new node();
        nn.data=item;
        nn.next=null;

        if(this.size>=1)
        {
            this.tail.next=nn;
        }
        if(this.size==0)
        {
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else
        {
            this.tail=nn;
            this.size++;
        }
    }
    
      public void addfirst(int item)
    {
        node nn=new node();
        nn.data=item;
        nn.next=null;
        if(this.size>=1)
        {
           nn.next=this.head;
        }
        if(this.size==0)
        {
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else
        {
            this.head=nn;
            this.size++;
        }
    }
    public void reverse()
    {
        Stack<Integer>stack=new Stack<>();
        
        node temp=head;
        while(temp!=null)
        {
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(!stack.isEmpty())
        {
            temp.data=stack.pop();
            temp=temp.next;
            
        }
    }
    public void display()
    {
        node temp=this.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
        public void display1()
    {
        node temp=this.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        linkedlistadd l1=new linkedlistadd();
        l1.addLast(20);
        l1.addLast(90);
        l1.addLast(80);
        l1.addLast(70);
        l1.addLast(30);
        l1.addfirst(18);
        System.out.println("ORGINAL");
        l1.display();
        System.out.println("reversed");
        l1.reverse();
        l1.display1();
       
        
    }
}