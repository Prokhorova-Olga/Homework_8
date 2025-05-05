import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1

        System.out.println("Task 1");
        int[] smallBox = new int[3];
        smallBox[0] = 1;
        smallBox[1] = 2;
        smallBox[2] = 3;

        double[] middleBox = new double[]{1.57, 7.654, 9.986};

        long[] bigBox = new long[]{1L, 6L, 8L, 14L, 1L};
        System.out.println();

        // Task 2

        System.out.println("Task 2");

        for (int i = 0; i < smallBox.length; i++) {
            if (i == smallBox.length - 1) {
                System.out.println(smallBox[i]);
                break;
            }
            System.out.print(smallBox[i] + ", ");
        }
        for (int i = 0; i < middleBox.length; i++) {
            if (i == smallBox.length - 1) {
                System.out.println(middleBox[i]);
                break;
            }
            System.out.print(middleBox[i] + ", ");
        }
        for (int i = 0; i < bigBox.length; i++) {
            if (i == bigBox.length - 1) {
                System.out.println(bigBox[i]);
                break;
            }
            System.out.print(bigBox[i] + ", ");
        }
        System.out.println();

        // Task 3

        System.out.println("Task 3");
        for (int i = smallBox.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(smallBox[i]);
                break;
            }
            System.out.print(smallBox[i] + ", ");
        }
        for (int i = middleBox.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(middleBox[i]);
                break;
            }
            System.out.print(middleBox[i] + ", ");
        }
        for (int i = bigBox.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(bigBox[i]);
                break;
            }
            System.out.print(bigBox[i] + ", ");
        }
        System.out.println();

        // Task 4

        System.out.println("Task 4");
        for (int i = 0; i < smallBox.length; i++) {
            if (smallBox[i] % 2 != 0)
                smallBox[i]++;
        }
        System.out.println(Arrays.toString(smallBox) + " ");
    }
}















































