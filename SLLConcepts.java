
class SLLConcepts {

    public static void main(String[] args) {
        //Scanner ran=new Scanner(System.in);
        SLLConcepts list = new SLLConcepts();
        list.addFirst(23);

        list.addLast(33);

        list.addFirst(13);
        //list.display();

        list.addLast(43);
        //list.display();

        list.addFirst(15);
        list.display();

        list.insertAtPosition(44, 4);
        list.display();

        list.deleteFromBeginning();
        list.display();

        list.deleteFromEnd();
        list.display();

        list.deleteFromPosition(3);
        list.display();

        list.search(33);
        list.search(49);

    }

    static class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    Node head = null;

    public void addFirst(int val) {
        Node NewNode = new Node(val);
        NewNode.next = head;
        head = NewNode;
    }

    public void addLast(int val) {
        Node NewNode = new Node(val);
        if (head == null) {
            head = NewNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=NewNode;
        }
    }

    public void insertAtPosition(int val, int index) {
        if (index == 1) {
            addFirst(index);
            return;
        }
        Node NewNode = new Node(val);
        Node temp = head;
        int count = 1;
        while (count != index - 1 && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("index is out of bounds.");
            return;
        }
        NewNode.next = temp.next;
        temp.next = NewNode;
    }

    public void search(int num) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == num) {
                System.out.println("Yes The Digit is present");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("The Digit is not Present");
        }
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteFromPosition(int index) {
        if (head == null) {
            System.out.println("The list is Empty");
            return;
        }
        if (index == 1) {
            head = head.next;
        }
        Node temp = head;

        for (int i = 1; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
