import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IncreasingArray {

    public static long minMoves(int n, long[] arr){
        long min = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i-1] > arr[i]) {
                min += arr[i-1] - arr[i];
                arr[i] = arr[i-1];  // Keeping this since we need the array to be non-decreasing
            }
        }

        return min;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the input
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];

        // Split the input line into individual numbers
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(input[i]);
        }

        // Call the minMoves function
        long result = minMoves(n, arr);

        // Output the result
        System.out.println(result);
    }
}
