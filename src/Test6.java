import java.util.Arrays;
import java.util.Date;

public class Test6 {
    public static void main(String[] args) {
        int[] ints = {1, 5, 2, 9, 4, 6, 1, 4, 5, 10, 4};
        System.out.println(Arrays.toString(ints));
        int countOfIterations = 0;

        for (int i = 0; i < ints.length - 1; i++) {
            countOfIterations++;
            for (int j = 0; j < ints.length - 1; j++) {
                countOfIterations++;
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(ints));
        System.out.println("Count of iterations: " + countOfIterations);
//        System.out.println(Arrays.toString(Arrays.stream(ints).sorted().toArray()));
    }
}
