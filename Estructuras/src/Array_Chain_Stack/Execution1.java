
package Array_Chain_Stack;

public class Execution1 {

    public static void main(String[] args) {

        LinearList x = new ArrayLinearList();
                
        System.out.println("Initial size is " + x.size());
        if (x.isEmpty()) 
            System.out.println("List is empty");
        else 
            System.out.println("The list is not empty");
        
        x.add(0, new Integer(2));
        x.add(1, new Integer(6));
        x.add(0, new Integer(1));
        x.add(2, new Integer(4));
        
        System.out.println("List size is " + x.size());
        System.out.println("The list is " + x);
        
        int index = x.indexOf(new Integer(4));
        
        if (index < 0) 
            System.out.println("4 not found");
        else 
            System.out.println("The index of 4 is " + index);
        
        index = x.indexOf(new Integer(3));
        
        if (index < 0) 
            System.out.println("3 not found");
        else 
            System.out.println("The index of 3 is " + index);
        
        System.out.println("Element at 0 is " + x.get(0));
        System.out.println("Element at 3 is " + x.get(3));
        System.out.println(x.remove(1) + " removed");
        System.out.println("The list is " + x);
        System.out.println(x.remove(2) + " removed");
        System.out.println("The list is " + x);
        
        x.set(1, new Integer(8));
        System.out.println("The list is " + x);
        
        if (x.isEmpty()) 
            System.out.println("List is empty");
        else 
            System.out.println("List is not empty");
        
        System.out.println("List size is " + x.size());
                
    }   
    
}
