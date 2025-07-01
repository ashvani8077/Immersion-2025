class Node{
    Node next;
    int data;
    public Node(int data){ 
        this.next = null;
        this.data = data;
    }
}
public class LinkedList{
    Node head;
    public void addFront(int data){
        Node nn=new Node(data);
        nn.next=head;
        head=nn;
    }

    public void addPosition(int data, int pos){
        Node nn=new Node(data);
        if(pos==0){
            nn.next=head;
            head=nn;
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1&&temp!=null;i++){
            temp=temp.next;
        }
        if (temp==null) {
            System.out.println("Position out of bound");
            return;
        }
        nn.next=temp.next;
        temp.next=nn;
    }

    public void addEnd(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=nn;

    }
    public void printList(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"--> ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFront(30);        
        list.addFront(20);         
        list.addFront(10);         
        list.addEnd(40);           
        list.addPosition(25, 2); 
        list.addPosition(5, 0);  
        list.printList();
        System.out.println();
        list.printListRecursion(list.head);
    }


    public Node addPositionRecursion(int data, int pos, Node temp){
        if(pos==0){
            Node nn=new Node(data);
            nn.next=head;
            head=nn;
            return nn;
        }
        if(temp==null){
            System.out.println("Position out of bound");
            return null;
        }
        temp.next=addPositionRecursion(data, pos-1, temp.next);
        return temp;
    }

    public void printListRecursion(Node temp){
        if(temp==null){
            return;
        }
        System.out.print(temp.data+"--> ");
        printListRecursion(temp.next);
    }
}
