import java.util.Arrays;

class Ma {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int[] res = solve(a, b);
        System.out.println(Arrays.toString(res));
    }

    public static int[] solve(int[] a, int[] b) {
        int[] c = new int[a.length + b.length]; // Create a new array to hold the merged result
        System.arraycopy(a, 0, c, 0, a.length); // Copy array a into c
        System.arraycopy(b, 0, c, a.length, b.length); // Copy array b into c starting from the end of a
        return c; // Return the merged array
    }
}
