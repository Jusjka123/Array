import java.util.Arrays;

class ArrayChecker {

    public static void main(String[] args) {
        int[] array = {4, 5, -3, 15, -2, 19, 6, -2, -4, 20, -17};
        System.out.println("Given array: "+ Arrays.toString(array));

        int x = 0;
        int y = 0;
        int z = 0;
        int w = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                x++;
            } else if (array[i] > 0) {
                y++;
            }
            if (array[i] % 2 != 0) {
                z++;
            } else if (array[i] % 2 == 0) {
                w++;
            }
        }
        System.out.println("Array has " + x + " negative, " + y + " positive, " + z + " odd and " + w + " even numbers.");
    }



}
