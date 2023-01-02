package bai1_29.pkg12;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(canJump(arr));
        int[] arr1 = {3,2,1,0,4};
        System.out.println(canJump(arr1));
        int[] arr3 = {3,1,2,0,2};
        System.out.println(canJump(arr3));
    }
    
    private static boolean canJump(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(max, i + arr[i]);
        }
        return true;
    }
}
