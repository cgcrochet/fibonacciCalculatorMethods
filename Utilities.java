
package project7;

public class Utilities {
    
    public static long recursiveFib(int n) {
        if (n <= 2)
            return 1;
        else
            return recursiveFib(n-1) + recursiveFib(n-2);
    }
    
    public static long iterativeFib(int m) {
        long outputValue;
        
        if (m <= 2) {outputValue = 1;}
        
        else {
            long olderValue = 1;
            long oldValue = 1;
            long newValue = 1;
            
            for (int i = 3; i <= m; i++) {
                newValue = oldValue + olderValue;
                olderValue = oldValue;
                oldValue = newValue;
            }
            
            outputValue = newValue;
        
        }
        
        return outputValue;
    }
    
}
