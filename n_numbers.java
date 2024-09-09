import java.util.Scanner;
class n_number
{
        public static void main(String ags[])
        {
                Scanner s = new Scanner(System.in);
                int n = s.nextInt();
                for(int i = 0;i<n;i++)
                {
                        System.out.println("The N Integers are:\n");
                        System.out.println(n - i);
                }
        }

}