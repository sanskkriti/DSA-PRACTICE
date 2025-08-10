import java.util.*;

public class DifferenceArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter size of array: ");
        int N = sc.nextInt();

        // Step 2: Create diff[] with N+1 size (NumArray style)
        int[] diff = new int[N + 1]; // all 0 by default

        // Step 3: Take number of updates
        System.out.print("Enter number of range updates: ");
        int q = sc.nextInt();

        // Step 4: Process updates
        // Each update: l, r, val
        for (int k = 0; k < q; k++) {
            System.out.print("Enter l r val: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int val = sc.nextInt();

            diff[l] += val;
            diff[r + 1] -= val; // safe because diff has N+1 length
        }

        // Step 5: Build prefix sum to get final array
        int[] arr = new int[N];
        arr[0] = diff[0];
        for (int i = 1; i < N; i++) {
            arr[i] = arr[i - 1] + diff[i];
        }

        // Step 6: Output final array
        System.out.println("Updated Array: " + Arrays.toString(arr));

        sc.close();
    }
}
