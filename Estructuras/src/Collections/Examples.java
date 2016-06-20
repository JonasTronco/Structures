package Collections;

import java.util.*;

public class Examples {
    
    public static void main (String[] args) {
        /*
        List<Double> x = new ArrayList();
        
        for (int i=0; i<10; i++)
            x.add(Math.random());
        
        Iterator i = x.iterator();
        while (i.hasNext()) {
            Object k = i.next();
            System.out.print(k+" ");
        }
        
        System.out.println();
                
        for (Iterator s = x.iterator(); s.hasNext();) {
            Object k = s.next();
            System.out.print(k+" ");
        }
        
        System.out.println();
        
        for (Double m : x)
            System.out.print(m+" ");
        
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Examples.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(x);
        
        */
        
        Set<String> conjunto1 = new HashSet();
        conjunto1.add("Orange");
        conjunto1.add("Grape");
        conjunto1.add("Apple");
        Set<String> conjunto2 = new HashSet();
        conjunto2.add("Orange");
        conjunto2.add("Strawberry");
        conjunto2.add("Pear");
        conjunto2.add("Pear");
        
        System.out.println(conjunto2.contains("Orange"));
        
        System.out.println(conjunto1);
        System.out.println(conjunto2);
        
        conjunto1.addAll(conjunto2);
        System.out.println(conjunto1);
        System.out.println(conjunto2);
        
        conjunto1.retainAll(conjunto2);
        System.out.println(conjunto1);
        System.out.println(conjunto2);
        
        conjunto1.removeAll(conjunto2);
        System.out.println(conjunto1);
        System.out.println(conjunto2);
     
        
    }
    
}
