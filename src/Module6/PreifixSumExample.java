package Module6;

public class PreifixSumExample {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int L1 = 1, R1 = 3;
        int L2 = 2, R2 = 4;

        int sum1;
        if (L1 == 0)
            sum1 = prefix[R1];
        else
            sum1 = prefix[R1] - prefix[L1 - 1];

        int sum2;
        if (L2 == 0)
            sum2 = prefix[R2];
        else
            sum2 = prefix[R2] - prefix[L2 - 1];

        System.out.println("Sum from index " + L1 + " to " + R1 + " = " + sum1);
        System.out.println("Sum from index " + L2 + " to " + R2 + " = " + sum2);
    }
}
