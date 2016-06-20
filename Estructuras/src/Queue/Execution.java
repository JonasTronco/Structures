package Queue;

public class Execution {

    public static void main(String[] args) {
        /*
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
        */
        
        int M = 3;
        int N = 12;

        // initialize the queue
        LinkedQueue q = new LinkedQueue();
        for (int i = 1; i <= N; i++)
            q.put(new Integer(i));

        while (!q.isEmpty()) {
            for (int i = 0; i < M - 1; i++)
                q.put(q.remove());
            System.out.print(q.remove() + " ");
        } 
        System.out.println();
                
    }
}
