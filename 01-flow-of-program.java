import java.util.*;
public class Day1dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n1. Input a year and find whether it is a leap year or not.\n");
        int var1 = sc.nextInt();
        if( var1%4 == 0) System.out.println(var1+", Yes,a Leap Year");
        else System.out.println(var1+", No, not a Leap Year");

        System.out.println("\n2. Take two numbers and print the sum of both.\n");
        System.out.println("\n Enter Number 1: ");
        int varA = sc.nextInt();
        System.out.println("\n Enter Number 2: ");
        int varB = sc.nextInt();
        System.out.println("\nThe Sum of the numbers, "+varA+" & "+varB+" is "+(varA+varB));

        System.out.println("\n3. Take a number as input and print the multiplication table for it.\n");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of "+num+":\n");
        for (int i=1 ; i<=10 ; i++)
        {
            System.out.println(num+" x "+i+" = "+(num*i));
        }

        System.out.println("\n4. To find a number Prime or Composite.\n");
        int pr = sc.nextInt();

            boolean flag = false;
            if(pr == 0 || pr == 1)
            {
                System.out.println(pr+"is neither Prime nor Composite");
                return;
            }
            if(pr > 1)
            {
                for (int i=2 ; i<pr ; i++)
                {
                    if(pr%i == 0) {flag = true; break;}
                }

                if(flag) System.out.println(pr+" is Composite Number.");
                else System.out.println(pr+" is a Prime Number");
            }



        System.out.println("5. To find HCF give two numbers input: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l,s,temp=-1;
        if(a>b){l=a; s=b;}
        else{l=b; s=a;}
        int ds=s, dv=l, r=-1;

        while (r != 0)
        {
            r = dv%ds;
            if(r==0){temp = ds; break;}
            dv =ds;
            ds = r;
        }
        System.out.println("HCF of "+a+" and "+b+" is "+temp);


        System.out.println("6. To Find LCM of two numbers:");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int lcm = p>q ? p : q;
        while(true){
            if (lcm % p == 0 && lcm % q == 0) {break;}
            lcm++;
        }
        System.out.println("LCM of "+p+" "+q+" is "+lcm);


        System.out.println("7. To add the numbers pressed, until x is given");
        int sum =0, in;
        while(sc.hasNextInt()) {//terminates if any alphabet is pressed
            in = sc.nextInt();
            sum += in;
        }
        System.out.println("The sum is : "+sum);

    }
}
