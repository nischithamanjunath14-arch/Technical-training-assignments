package Module7;

public class FirstLastOccurrence {
    //first occurrence
    static int firstOccurrence(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                result = mid;
                high = mid - 1; // search left side
            }
            else if (arr[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return result;
    }

    //last occurrence
    static int lastOccurrence(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                result = mid;
                low = mid + 1; // search right side
            }
            else if (arr[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4,5};
        int key = 2;

        int first = firstOccurrence(arr, key);
        int last = lastOccurrence(arr, key);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
