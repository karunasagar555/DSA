//Let's Remind : Subarray and Subsequences are same


import java.io.*;
import java.util.*;

public class Main
{   
    public static int dtob(int n, int b) 
    {
        int  ans = 0;
        int power = 1;
        while(n!= 0)
        {
            int rem = n % b;
            n = n / b;
            ans = ans + (rem*power) ;
            power = power*10;
        }
        return ans;
    } 
    
    public static void main (String [] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int [n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        int ts = (int)Math.pow(2,n);
        for(int i = 0; i < ts; i++)
        {
            int bn = dtob(i,2);
            int div =(int)Math.pow(10, n-1);
            for(int j = 0; j<arr.length; j++)
            {
                int q = bn / div;
                int r = bn % div;
                
                if(q == 1)
                {
                    System.out.print(arr[j]+"\t");
                }
                else
                {
                    System.out.print("-\t");
                }

                bn = r;    
                div = div/10;
            }
            System.out.println();
        }

    }
}