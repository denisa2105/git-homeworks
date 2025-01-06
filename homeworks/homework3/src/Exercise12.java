public class Exercise12 {
    public static void main(String[] args) {

        // 12. Copy the elements of one array into another array.
        int[] array = {1, 2, 3, 4, 5};
        int[] copyOfArray = new int[5];

        for (int i = 0; i < array.length; i++) {
            copyOfArray[i] = array[i];
        }

        for (int value : copyOfArray) {
            System.out.println(value);
        }
    }
}
