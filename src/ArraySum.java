import java.util.Scanner;

public class ArraySum {
    int n;
    int arr[];
    ArraySum()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         arr=new int[n];
         for(int i=0;i< arr.length;i++)
         {
             arr[i]=sc.nextInt();
         }

    }
    public void sum()
    {
      int flag=0;
      int flag1=0;
      for(int i=0;i< arr.length;i++)
      {
          if(arr[i]==6)
          {
              flag=i;
          }
          if(arr[i]==7)
          {
              flag1=i;
          }
      }
      int sum1=0;
          for(int i=0;i< arr.length;i++)
          {
              if(i < flag || i > flag1)
              {
                  sum1=sum1+arr[i];
              }
          }

        System.out.println(sum1);
    }
}
class Main1
{
    public static void main(String[] args) {
        ArraySum x=new ArraySum();
        x.sum();
    }
}
