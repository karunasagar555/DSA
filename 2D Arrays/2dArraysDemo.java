// 2darrays demo

import java.util.*;
  
  public class Main
  {
  
    public static void main(String[] args) 
    {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      int arr[][] = new int[n][m];
      for( int i = 0 ;i < n  ; i++  ) 
      {
        for( int j = 0 ; j < m ; j++ ) 
        {
          arr[i][j] = scn.nextInt();  
          System.out.print(arr[i][j] + " ");   //(remember it's print, not println )    
        }
        System.out.println();
      }
      
    }
  }