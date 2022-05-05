// Difference Of Two Arrays question

import java.io.*;
import java.util.*;

public class Main
{

    public static void main(String[] args) throws Exception
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int a1 [] = new int [n1];
        for(int i = 0; i<n1; i++)
        {
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int a2 [] = new int [n2];
        for(int i = 0; i<n2; i++)
        {
            a2[i] = scn.nextInt();
        }
        int ans [] = new int [n2];
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = ans.length - 1;
        int borrow = 0;
        while(k >= 0)
        {
            int diff = a2[j] - borrow;

            if(i >= 0)
            {
                diff = diff - a1[i];
            } 

            if(diff < 0)
            {
                diff = diff + 10;
                borrow = 1;
            }
            else
            {
                borrow = 0;
            }
            ans[k] = diff;
            i--;
            j--;
            k--;
        } 
        i = 0;
        while(ans[i] == 0)
        {
            i++;
        }
        for(; i < ans.length; i++)
        {
            System.out.println(ans[i]);
        }
    }

}
