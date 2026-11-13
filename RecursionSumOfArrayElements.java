import java.util.Scanner;

class Solution {
    int n=-1;
    public int arraySum(int[] nums) {
        n++;
        if(n==nums.length-1){
            return nums[n];
        }
        return nums[n]+arraySum(nums);
    }
}

class RecursionSumOfArrayElements {
    public static void main(String[] args) {
        // 1. Create an object of the Solution class
        Solution solver = new Solution();
        
        Scanner sc=new Scanner(System.in);
        
        // 2. Put your test number here
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 3. Call the method and print the output
        var ans = solver.arraySum(arr);
        System.out.println("Output: " + ans);
        sc.close();
    }
}
