package Queue;

public class Execution {

    public static void main(String[] args) {
        
        ArrayQueue q = new ArrayQueue(3);
        q.put(new Integer(1));
        q.put(new Integer(2));
        q.put(new Integer(3));
        q.put(new Integer(4));
        while (!q.isEmpty()) {
            System.out.println("Rear element is "
                    + q.getRearElement());
            System.out.println("Front element is "
                    + q.getFrontElement());
            System.out.println("Removed the element "
                    + q.remove());
        }   
    }
}
