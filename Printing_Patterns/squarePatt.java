/*
 input=4
 * * * *
 *     *
 *     *
 * * * *
 */

import java.util.*;
class squarePatt{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1)
                {
                    if(j==n-1)
                    {
                        System.out.print("*");
                        System.out.println();
                    }
                    else
                    {
                        System.out.print("* ");
                    }

                    if(i==n-1 && j==n-1)
                    {
                        return;
                    }
                }
                else
                {
                    System.out.print("  ");
                }
            }
        }
    }
}