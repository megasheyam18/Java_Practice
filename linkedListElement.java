import java.util.Stack;

class node {
    int data;
    node next;
    
}

public class linkedListElement {
    

    public node head;
    public node tail;
    public int size;
    public void addLast(int item) {
        node nn = new node();
        nn.data = item;
        nn.next = null;
        if (this.size >= 1) {
            this.tail.next = nn;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }
    }
    public void dispaly()
    {
        node temp=this.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;

        }
    }
    public node getnode(int indx)
    {
        if(this.size==0)
        {
            System.out.println("list is empty");
        }
        if(indx<0||indx>this.size)
        {
            System.out.println("index out of bound");
        }
        node temp=this.head;
        for(int i=0;i<indx;i++)
        {
            temp=temp.next;

        }
        return temp;
    }

    public void removelast(int indx)
    {
        if(this.size==0)
        {
            System.out.println("list is empty");
        }
        if(this.size==1)
        {
            this.head=null;
            this.tail=null;
            this.size=0;
        }

            node nm1=getnode(indx-1);
            node mp1=getnode(indx+1);
            nm1.next=mp1;
            this.size--;

    }
    public void addatfirst(int item)
    {
        node nn=new node();
        nn.data=item;
        nn.next=null;
        if(this.size>=1) {
            nn.next = this.head;
        }
        if(this.size==0)
        {
            this.head=nn;
            this.tail=nn;
            size++;
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
        node current= head;
        while(current!=null)
        {
            stack.push(current.data);
            current=current.next;
        }

        current=head;
        while(!stack.isEmpty())
        {
            current.data=stack.pop();
            current=current.next;
        }

    }

        public static void main(String[] args) {
            linkedListElement list = new linkedListElement();
            list.addLast(20);
            list.addLast(56);
            list.addLast(89);
            list.addLast(10);

            list.removelast(3);
            list.addatfirst(18);

            list.reverse();


            list.dispaly();
        }
    }