import java.util.Arrays;

class ArrayChecker {

    public static void main(String[] args) {
        int[] array = {4, 5, -3, 15, -2, 19, 6, -2, -4, 20, -17};
        System.out.println("Given array: " + Arrays.toString(array));

        int x = 0;
        int y = 0;
        int z = 0;
        int w = 0;
        for (int number : array) {
            if (number < 0) {
                x++;
            } else if (number > 0) {
                y++;
            }

            if (number % 2 != 0) {
                z++;
            } else {
                w++;
            }
        }
        System.out.println("Array has " + x + " negative, " + y + " positive, " + z + " odd and " + w + " even numbers.");
    }
}
