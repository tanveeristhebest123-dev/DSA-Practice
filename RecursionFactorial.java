import java.util.Scanner;

class Solution {
    public long factorial(int n) {
        if(n==1){
            return 1;
        }
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}

class RecursionFactorial {
    public static void main(String[] args) {
        // 1. Create an object of the Solution class
        Solution solver = new Solution();
        
        Scanner sc=new Scanner(System.in);
        
        // 2. Put your test number here
        int n = sc.nextInt();
        
        // 3. Call the method and print the output
        var ans = solver.factorial(n);
        System.out.println("Output: " + ans);
        sc.close();
    }
}
