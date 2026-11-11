import java.util.Scanner;

class Solution {
    boolean arraySortedOrNotInAscendingOrder(int[] arr, int n) {
        int f=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<f){
                return false;
            }
            f=arr[i];
        }
        return true;
       
    }
}

class ArrayInAcsendingOrNot {
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
        var ans = solver.arraySortedOrNotInAscendingOrder(arr, n);
        System.out.println("Output: " + ans);
        sc.close();
    }
}
