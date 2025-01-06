public class Exercise9 {
    public static void main(String[] args) {

        // 9. Write a program to find
        // the largest element in an array of integers.
        int[] arr = {20, 56, 789, 0, -8};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
