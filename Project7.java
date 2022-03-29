
package project7;


public class Project7 {
    // Comment for GitHub tutorial

    public static void main(String[] args) {
        System.out.printf("%-10s%-15s%-20s%-10s\n", "x", "fib(x)", "Recursive(ns)", "Iterative(ns)"); 
        System.out.println("==========================================================");
        
        for(int i = 10; i <= 50; i += 10) 
            { 
                 
                //Calculate time in nano second for recursive Fibonacci 
                long start= System.nanoTime() / 1000; 
                Utilities.recursiveFib(i);   
                long elapsedRec = (System.nanoTime() / 1000) - start;  
                 
                //Calculate time in nano second for iterative Fibonacci 
                start= System.nanoTime(); 
                long feb = Utilities.iterativeFib(i); 
                long elapsedIter = System.nanoTime() - start;  
                 
                 
                System.out.printf("%-10d%-15d%,-20d%,-10d\n",i, feb, elapsedRec, elapsedIter);   
            } 
                 
        System.out.println("==========================================================");
    }
    
}
