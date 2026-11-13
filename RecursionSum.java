import java.util.Scanner;

class Solution {
    public int NnumbersSum(int N) {
        if(N==0){
            return N;
        }
        return N+NnumbersSum(N-1);
    }
}

class RecursionSum {
    public static void main(String[] args) {
        // 1. Create an object of the Solution class
        Solution solver = new Solution();
        
        Scanner sc=new Scanner(System.in);
        
        // 2. Put your test number here
        int n = sc.nextInt();
        
        // 3. Call the method and print the output
        var ans = solver.NnumbersSum(n);
        System.out.println("Output: " + ans);
        sc.close();
    }
}
