//second_largest_smallest_array
import java.util.Scanner;
class Second_large
{
        public static void main(String args[])
        {
                //we use Insertion sort and get using indexes, we will try anathor way also
                Scanner s = new Scanner(System.in);
                int n = s.nextInt();
                int[] arr =  new int[n];
                for(int i = 0;i<n;i++)
                {
                        arr[i] = s.nextInt();
                }
                insertionsort(arr, n);

        }
        private static void insertionsort(int[] a, int n)
        {
                for(int i = 0;i<n;i++)
                {
                        for(int j = i+1;j<n;j++)
                        {
                                if (a[j] > a[i] )
                                {
                                        int temp = a[j];
                                        a[j] = a[i];
                                        a[i] = temp;
                                }
                        }
                }
                int sec_small = a[ n - 2];
                int sec_large = a[1];
                System.out.println("Second Largest:" +sec_large+ "\tSecond Smallest: " +sec_small);
        }
}
