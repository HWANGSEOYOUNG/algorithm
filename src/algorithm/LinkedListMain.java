package algorithm;

public class LinkedListMain{
    public static void main(String args[]){
        LinkedList<String> L = new LinkedList<String>();
        System.out.println("(1) ���� ����Ʈ�� ��� 3�� �����ϱ�");
        L.insertLastNode("��");
        L.insertLastNode("��");
        L.insertLastNode("��");
        L.printList();

        System.out.println("(2) �� ��� �ڿ� �� ��� �����ϱ�");
        ListNode<String> pre = L.searchNode("��");
        if(pre == null)
            System.out.println("�˻�����>> ã�� �����Ͱ� �����ϴ�.");
        else{
            L.insertMiddleNode(pre, "��");
            L.printList();
        }

        System.out.println("(3) ����Ʈ�� ��带 �������� �ٲٱ�");
        L.reverseList();
        L.printList();

        System.out.println("(4) ����Ʈ�� ������ ��� �����ϱ�");
        L.deleteLastNode();
        L.printList();
    }
}

class LinkedList<E>{
    private ListNode<E> head;
    public LinkedList(){
        head = null;
    }
    public void insertMiddleNode(ListNode<E> pre, E data){
        ListNode<E> newNode = new ListNode<E>(data);
        newNode.link = pre.link;
        pre.link = newNode;
    }

    public void insertLastNode(E data){
        ListNode<E> newNode = new ListNode<E>(data);
        if(head == null){
            this.head = newNode;
        }
        else{
            ListNode<E> temp = head;
            while(temp.link != null)
                temp = temp.link;
            temp.link = newNode;
        }
    }

    public void deleteLastNode(){
        ListNode<E> pre, temp;
        if(head == null)  return;
        if(head.link == null){
            head = null;
        }
        else{
            pre = head;
            temp = head.link;
            while(temp.link != null){
                pre = temp;
                temp = temp.link;
            }
            pre.link = null;
        }
    }

    public ListNode<E> searchNode(E data){
        ListNode<E> temp = this.head;
        while(temp != null){
            if(data.equals(temp.getData()))
                return temp;
            else
                temp = temp.link;
        }
        return  temp;
    }

    public void reverseList(){
        ListNode<E> next = head;
        ListNode<E> current = null;
        ListNode<E> pre = null;
        while(next != null){
            pre = current;
            current = next;
            next = next.link;
            current.link = pre;
        }
        head = current;
    }

    public void printList(){
        ListNode<E> temp = this.head;
        System.out.print("L = (");
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.link;
            if(temp != null){
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }
}

// �������
class ListNode<E>{
    private E data;         // �����
    public ListNode link;   // ���� ��带 ����Ų��.
    public ListNode(){
        this.data = null;
        this.link = null;
    }
    public ListNode(E data){
        this.data = data;
        this.link = null;
    }
    public ListNode(E data, ListNode link){
        this.data = data;
        this.link = link;
    }
    public E getData(){
        return  this.data;
    }
}