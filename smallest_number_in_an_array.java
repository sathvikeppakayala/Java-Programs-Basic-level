//smallest_number_in_an_array
import java.util.Scanner;
class smallest_number
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
                int res = Smallest_number(arr, n);
                System.out.println("Smallest Number in the Array:   " +res);

        }
        private static int Smallest_number (int[] arr, int n)
        {
                int min = 99999;
                for (int i = 0;i<n;i++)
                {
                        if (arr[i] < min)
                        {
                                min = arr[i];
                        }
                }
                return min;
        }
}
//output: ---->
/* Enter No. of Elements in the array

5
Enter the elements of the array
12
56
43
22
10
Smallest Number in the Array:   10 */
