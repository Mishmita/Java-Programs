import java.util.Scanner;
public class Test1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,flag=0;
        System.out.println("enter the lower range");
        int lower=sc.nextInt();
        System.out.println("enter the upper range");
        int upper=sc.nextInt();
        System.out.println("prime numbers between"+lower+ "and" +upper+ "are");
        for(i=lower;i<upper;i++)
        {
            for(n=2;n<i;n++)
            {
                if(i%n==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(i+ " ");
            }
        }
    }
}
    