import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int flag=0;
        n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2 && n!=0;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("no is not pallindrome");
        }
        else
        {
            System.out.println("no is pallindrome");
        }

    }
}
