//smallest_number_in_an_array
import java.util.Scanner;
class large_number
{
        public static void main(String args[])
        {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter No. of Elements in the array\n");
                int n = s.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter the elements of the array");
                for(int i = 0;i < n;i ++)
                {
                        arr[i] = s.nextInt();
                }
                int res = largest_number(arr, n);
                System.out.println("Largest Number in the Array:   " +res);

        }
        private static int largest_number (int[] arr, int n)
        {
                int max = -99999;
                for (int i = 0;i<n;i++)
                {
                        if (arr[i] > max)
                        {
                                max = arr[i];
                        }
                }
                return max;
        }
}
//ouput:---->
/* Enter No. of Elements in the array

5
Enter the elements of the array
12
45
78
43
21
Largest Number in the Array:   78 */
