package Array_Chain_Stack;

public class Estructuras3 {

    public static void main(String[] args) {
        
        CircularWithHeader x = new CircularWithHeader();
        for (int i = 0; i < 10; i++)
            x.add(i, new Integer(i));
        
        System.out.println("List=" + x);
        
        for (int i = 0; i < 5; i++)
            x.remove(2);
        
        System.out.println("List=" + x);
        
        for (int index = 0; index < x.size; index++)
            x.set(index, (int) x.get(index) + index);
        
        System.out.println("List=" + x);
        
        for (int i = 0; i < 10; i++)
            System.out.println(i + " is element " + x.indexOf(new Integer(i)));
        
        
    }
    
}
