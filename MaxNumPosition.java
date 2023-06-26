import java.util.Scanner;

public class MaxNumPosition 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Taking the size of the array as input.
        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        // Declaring an array.
        int[] arr = new int[n];
        System.out.println("Enter the values of the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();   // Storing values in the array.
        }
        
        int maxNum = arr[0];
        int pos = 0;
        // Iterating through the array to find maximum number.
        for(int i=0;i<n;i++)
        {
            if(arr[i] > maxNum)
            {
                maxNum = arr[i]; // Storing the maximum number in maxNum.
                pos = i;       // Storing the position of maximum number at its 1st occurence in pos.
            }
        }
            System.out.println("Maximum number in the array is : "+maxNum);  
            System.out.println("Postion of 1st occurence is : "+pos);  
in.close();
    }
}
