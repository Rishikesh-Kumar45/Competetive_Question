import java.util.Scanner;

public class Practice2 {
    public static int findTarget(int nums[], int target){
        for(int i=0; i<nums.length; i++){
            if (nums[i] == target) {
                return target;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 5;
        System.out.println(findTarget(nums, target));
    }
}
