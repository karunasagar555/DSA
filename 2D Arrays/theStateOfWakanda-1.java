//state of wakanda-1

import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String [] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // no of rows
        int m = scn.nextInt(); //no of columns
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        for(int j = 0; j<m; j++)
        {
            if(j%2 == 0)
            {
                for(int i = 0; i<n; i++)
                {
                    System.out.println(arr[i][j]);
                }
            }
            else
            {
                for(int i = n-1; i>=0; i--)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
}
