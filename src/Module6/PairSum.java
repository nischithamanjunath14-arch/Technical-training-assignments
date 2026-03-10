package Module6;


import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 5, 1, 3};
        int target = 6;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (set.contains(complement)) {
                System.out.println(complement + " + " + arr[i] + " = " + target);
            }

            set.add(arr[i]);
        }
    }
}
