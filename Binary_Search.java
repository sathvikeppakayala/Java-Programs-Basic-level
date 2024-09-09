//Binary search Algorithm to search the key given
import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arr = new int[n];
       for(int i = 0;i<n;i++)
       {
           arr[i] = s.nextInt();
       }
       int key = s.nextInt();
       System.out.println(BinarySearch(arr, key, n));
       s.close();
    }
    private static int BinarySearch(int[] arr, int key, int n)
    {
        if (arr.length == 0)
        {
            return -1;
        }
        int low = 0;
        int high = n - 1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if (arr[mid] > key)
            {
                high = mid;
            }
            else if (arr[mid] < key)
            {
                low = mid + 1;
            }
            else if (arr[mid] == key)
            {
                return mid;
            }
        }
        return -1;
    }
}