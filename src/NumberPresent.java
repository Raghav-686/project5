import java.util.Scanner;

public class NumberPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter key to search");
        int key;
        key=sc.nextInt();
        int flag=0;
        n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Key found");
        }
        else
        {
            System.out.println("Key not found");
        }

    }
}
