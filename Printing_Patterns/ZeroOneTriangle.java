/*
input=4 
1
0 1
1 0 1
0 1 0 1

 */
import java.util.*;
class ZeroOneTriangle{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1; j<=i ;j++)
            {
                if(i%2 != 0)//odd row
                {
                    if(j%2 != 0)//odd col in odd row 1
                    {
                        System.out.print("1");
                    }
                    if(j%2 == 0)//even col in odd row 0
                    {
                        System.out.print(" 0 ");
                    }
                }

                if(i%2 == 0)//even row
                {
                    if(j%2 != 0)//odd col in even row 0
                    {
                        System.out.print("0");
                    }
                    if(j%2 == 0)//even col in even row 1
                    {
                        System.out.print(" 1 ");
                    }
                }

            }
                System.out.println();
        }
    }
}