import java.util.*;
class Oddnumber
  {
    public static void main(String args[])
    {
      int i=1,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("Odd number");
      for(i=1;i<=n;i++)
        {
          if(i%2!=0)
          {
            System.out.println(i);
          }
        }
    }

  }