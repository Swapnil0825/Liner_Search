import java.util.*;

public class Linear_search
{
    public static void main(String[] args) 
    {
        int size,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=sc.nextInt();

        int[] a=new int[50];
        System.out.println("Enter the array elements");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt(); 
        }

        System.out.println("Enter the data you want to search");
        int data=sc.nextInt();
        
        for(i=0;i<size;i++)
        {
            if(data==a[i])
            {
                System.out.println("Element found at Index:"+i);
            }
        }
        if(data==size)
        {
            System.out.println("Element is not foun");
        }
    }
}