class Basic{
    Node head;
    private int size;

    Basic(){
        size=0;
    }
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }

    public void printList(){
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode= currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("Empty list nothing is to delete");
            return;

        }
        head=this.head.next;
        size--;
    }

    public void removelast(){
        if(head==null){
            System.out.println("Empty list nothing is to delete");
            return;

        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast= head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=secondLast.next;
            lastNode= lastNode.next;

        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String args[]){
        Basic list = new Basic();
        list.addLast("is");
        list.addLast("a");
        list.addLast("Good");
        list.addLast("girl");
        list.printList();
        list.addFirst("Sonali");
        list.printList();

        System.out.println(list.getSize());

        list.removeFirst();
        list.printList();

        list.removelast();
        list.printList();
    }
}
