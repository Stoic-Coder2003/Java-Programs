import java.util.*;
public class House_Robber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of houses ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the values of array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The answer of this problem is "+Solution(arr));
    }

    public static int Solution(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        //for the condition of having no house in the lane

        if (n == 1)
            return nums[0];
        //for the condition if there is only one house in the lane

        int[] arr = new int[n];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++)
            arr[i] = Math.max(nums[i] + arr[i - 2], arr[i - 1]);

        return arr[n - 1];
    }
}

