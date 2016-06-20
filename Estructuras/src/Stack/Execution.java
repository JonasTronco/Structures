package Stack;

public class Execution {
    
    public static void main(String[] args){
        
        int N=500000000;
        Stack stack = new ArrayStack();
        while (N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
        System.out.println();

        
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
