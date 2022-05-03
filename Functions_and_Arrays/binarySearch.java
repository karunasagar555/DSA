import java.io*;
import java.util.*

public class Main
{   
    public static int binarySearch(int arr[], int n, int data)
    {
        int left = 0;
        int right = n-1;
        while(left<=right)
        {
            int mid = (left + right) / 2;
            
            if(arr[mid] == data)
                return mid;
            
            else if(arr[mid] < data)
                left = mid + 1;
            
            else
                right = mid - 1;
        }
        return -1;
    }
    public class static void main(string [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int ind = binarySearch(arr,n,data);
        System.out.println(ind);
    }
}