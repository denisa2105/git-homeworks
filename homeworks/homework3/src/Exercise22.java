public class Exercise22 {
    public static void main(String[] args) {

        // 22. Write a method that takes an integer array as input and
        // returns a new array with the elements reversed.

        int[] myArray = {2, 4, 5, 6, 7};

        int[] reversed = reversedArray(myArray);

        for (int element : reversed) {
            System.out.print(element + " ");
        }
    }

    public static int[] reversedArray(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0 ; i--) {
            newArray[j++] = array[i];
        }

        return newArray;
    }
}
