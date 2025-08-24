public class famnod {
    public static void main(String[] args) {
        Node fam = new Node("enzo");
        fam.next = new Node("carl");
        fam.next.next = new Node ("joy");
        fam.next.next.next = new Node("mark");

        Node newfam = fam;



        while(newfam != null) {
            System.out.print(newfam.data + " -> ");
            newfam = newfam.next;
        }
        System.out.println("null");


    }

    static class Node {
        String data;
        Node next;
        Node prev;
        public Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
        }
    }
}
