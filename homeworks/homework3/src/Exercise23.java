public class Exercise23 {
    public static void main(String[] args) {

        // 23. Write two methods: one that finds the minimum and another that
        // finds the maximum value in an array of integers.

        int[] myArray = {2, 6, 70, -8, 0, 7};

        System.out.println("The minimum of this array is: " + minimum(myArray));
        System.out.println("the maximum of this array is: " + maximum(myArray));
    }

    public static int minimum(int[] array) {
        int minim = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] < minim) {
                minim = array[i];
            }
        }
        return minim;
    }

    public static int maximum(int[] array) {
        int maxim = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxim) {
                maxim = array[i];
            }
        }
        return maxim;
    }
}
