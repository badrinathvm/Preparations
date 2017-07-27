/**
 * Created by Badri on 7/22/17.
 */
public class PairSortedArray {

    public static void main(String[] args) {
            int arr[] = {11, 15, 6, 8, 9, 10};
            int sum = 14;
            int n = arr.length;
        System.out.println(PairSortedArray.pairInSortedRotated(arr,n,14));
    }


    static Boolean pairInSortedRotated(int arr[], int n, int x)
    {
        // Find the pivot element
        int i;
        for (i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
                break;
        int l = (i+1)%n;  // l is now index of minimum element
        int r = i;        // r is now index of maximum element

        // Keep moving either l or r till they meet
        while (l != r)
        {
            // If we find a pair with sum x, we return true
            if (arr[l] + arr[r] == x)
                return true;

            // If current pair sum is less, move to the higher sum
            if (arr[l] + arr[r] < x)
                l = (l + 1)%n;
            else  // Move to the lower sum side
                r = (n + r - 1)%n;
        }
        return false;
    }
}
