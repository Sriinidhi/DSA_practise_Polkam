/*
input=4
1 2 3 4
1 2 3
1 2
1
 */
import java.util.*;
class NumIncRevPyr{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=n-1 ; i>=0 ; i--)
        {
            int temp=1;
            for(int j=0; j<=i ;j++)
            {
                System.out.print(temp);
                temp++;
                if(j==i)
                {
                    System.out.println();
                }
                else System.out.print(" ");
            }
        }
    }
}