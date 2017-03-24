package Stack;

public class Execution {
    
    public static void main(String[] args){
        
        Stack x = new  ArrayStack();
        Stack y = new  LinkedStack();

        x.push(new Integer(8));
        x.push(new Integer(1));
        x.push(new Integer(2));
        x.push(new Integer(3));
        System.out.println (x);
        x.pop();
        System.out.println (x);
       
        y.push(new Integer(8));
        y.push(new Integer(1));
        y.push(new Integer(2));
        y.push(new Integer(3));
        System.out.println (y);
        y.pop();
        System.out.println (y);
       
    }
}
