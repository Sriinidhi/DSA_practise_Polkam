/*
 
input=4
   1
  2 2
 3 3 3
4 4 4 4

 */
import java.util.*;
class NumTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter");
        int n = sc.nextInt(); 
        sc.close();
        int temp = 1;
        for(int i=0 ; i<n ; i++)
        {
            //spaces
            for(int j=n-1 ; j>=i ; j--)
            {
                System.out.print(" ");
            }
            //nums
            for(int j=0 ; j<=i ; j++)
            {
                if(temp>n)
                {return;}
                {if(j==i)
                {
                    System.out.print(temp);
                    System.out.println();
                    temp++;
                }
                else
                {
                    System.out.print(temp+" ");
                }}
            }
        }
    }
}