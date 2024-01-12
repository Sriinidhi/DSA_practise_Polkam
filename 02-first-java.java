import java.util.*;
public class Day2dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println("\n1. To print if given num is Even or odd:");
        int e = sc.nextInt();
        if (e % 2 == 0) {System.out.println("Yes, " + e + " is an even Number.");}
        else{System.out.println("Yes, " + e + " is an odd Number.");}

        System.out.println("\n2. To greet the input name :");
        String s = sc.nextLine();
        System.out.println("Hello! "+s+".\nIt was Nice Meeting you.\nI hope you have a great Day\n:)");

        System.out.println("\n3. To print the Simple Interest of given P,T,R:");
        System.out.println("\nPlease enter the PRINCIPLE AMOUNT: ");
        double p  = sc.nextDouble();
        System.out.println("\nPlease enter the Time: ");
        int t  = sc.nextInt();
        System.out.println("\nPlease enter the Rate of Interest: ");
        double r  = sc.nextDouble();
        System.out.println("The Simple Interest of given,\nP = "+p+"\nT = "+t+"\nR = "+r+" is:\nPTR/100\nSimple Interest is: "+((p*t*r)/100));

        System.out.println("\n4. To perform +, -, *, / for the desired operation:");
        System.out.println("Enter Two numbers:");
        int n1 = sc.nextInt();int n2 = sc.nextInt();
        System.out.println("\nPress the desired operation\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int in = sc.nextInt();
            if(in==1){System.out.println("The Addition of "+n1+" and "+n2+" is "+(n1+n2));}
            if(in==2){System.out.println("The Subtraction of "+n1+" and "+n2+" is "+(n1-n2));}
            if(in==3){System.out.println("The Multiplication of "+n1+" and "+n2+" is "+(n1*n2));}
            if(in==4){System.out.println("The Division of "+n1+" and "+n2+" is "+(n1/n2));}
            if(in<1 || in>4){System.out.println("Invalid input!");}

        System.out.println("\n5. Take two numbers and Print the Largest number:");
            double l1 = sc.nextDouble();
            double l2 = sc.nextDouble();
           double lar = (l1 > l2) ? l1 : l2;
        System.out.print("The Largest Number is : "+lar);

        System.out.println("\n6. Input currency in Rupees Convert and Output it in USD:\nEnter Currency in Rupees: ");
        double ru = sc.nextDouble();
        System.out.println("Output of Rs."+ru+" in USD is :"+(ru*83.3029));

        System.out.println("\n7a. To calculate Fibonacci Series up to n numbers using FOR LOOP\nEnter nth term:");
        int n = sc.nextInt();
        int[] arr = new int[50];
        arr[0] = 0;
        arr[1] = 1;
        System.out.print(arr[0]+", "+arr[1]+", ");
        for(int i=2; i < 20 ; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.print(arr[i]+", ");
            if(i == n)
            {
                break;
            }
        }
        System.out.print("and so on ............");

        System.out.println("\n7b. To calculate Fibonacci Series up to n numbers using WHILE LOOP\nEnter nth term:");
        int nx = sc.nextInt();
        int i = 2, f0 = 0, f1 = 1, fn;
        System.out.print(f0+", "+f1+", ");
        while(i <= nx)
        {
            fn = f0 + f1;
            System.out.print(fn+", ");
            f0 = f1;
            f1 = fn;
            i++;
        }
        System.out.print("and so on ............");

        System.out.print("\n8. To find out whether the given String is Palindrome or not, Enter a String:");
        String ss = sc.nextLine();
        int len = ss.length();boolean ans=true;
        for(int i8=0 ; i8<len/2 ; i8++)
        {
            if(ss.charAt(i8) != ss.charAt(len-1-i8)) {
                ans = false;
                break;
            }
        }
        if(!ans) System.out.print(ss+", Not a Palindrome");
        else System.out.print(ss+", is a Palindrome");

        System.out.println("\n9a. To check if the given input is an ARMSTRONG number or not.");
        int x = sc.nextInt();
        int temp = x, term=0, o=0, res=0;
        int[] ar = new int[10];
        while(temp != 0)
        {
            term = temp%10;
            ar[o] = term;
            o++;
            temp = temp/10;
        }
        //o is the length of the number (order)
        System.out.println();
        for(int i7=o-1; i7>=0 ; i7--)
        {
            res = res + (int)Math.pow(ar[i7], o);
            System.out.print("("+ar[i7]+") ^ "+o+" + ");
        }
        System.out.println("\n= "+res);
        if(res == x) System.out.println("Yes, "+x+" is an ARMSTRONG number.");
        else System.out.println("No, "+x+" is not an ARMSTRONG number.");


        System.out.println("\n9. To find Armstrong Number between two given number.\n Enter the Range:\nLower Limit: ");
        int low = sc.nextInt();
        System.out.println("Upper Limit: ");
        int up = sc.nextInt();
        System.out.println("The Armstrong Number between "+low+" and "+up+" are :");
        for(int i9 = low; i9<= up; i9++)
        {
            if(isArm(i9)){ System.out.print(i9+" ");}
        }

    }

    public static boolean isArm(int x)
    {
        int temp = x, term, o=0, res=0;
        int[] arr = new int[10];

        while(temp != 0)
        {
            term = temp%10;
            arr[o] = term;
            o++;
            temp = temp/10;
        }
        //o is the length of the number (order)
        for(int i=o-1; i>=0 ; i--)
        {
            res = res + (int)Math.pow(arr[i], o);
        }
        if(res == x) {return true;}
        else {return false;}


    }
}
