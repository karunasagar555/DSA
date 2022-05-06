import java.io.*;
import java.util.*;

public class Main 
{

    public static void main(String[] args) throws Exception 
    {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        
        // Finding the Transpose of the Matrix
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                //SWAPING
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Row reversing of array using two pointer approach  // 2d array reverse code
        int left = 0; //1,2
        int right = n-1; //3,2,1
        while(left<right)
        {
            for(int i = 0; i<n; i++)
            {
              int temp = arr[i][left];
              arr[i][left] = arr[i][right];
              arr[i][right] = temp;
            }
            left++;
            right--;
           
        }
        display(arr);
    }

    public static void display(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

// public static void display(int arr[][])
// {
//     for(int i = 0; i<n; i++)
//     {
//         for(int j = 0; j<n; j++)
//         {
//             System.out.print(arr[i][j] + " ");
//         }
//         System.out.println();
//     }
// }
