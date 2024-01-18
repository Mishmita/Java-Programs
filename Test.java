import java.util.Scanner;
public class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int total=0;
        System.out.println("enter students name");
        String name=sc.nextLine();
        System.out.println("enter students roll number");
        int roll=sc.nextInt();
        System.out.println("enter marks:");
        for(int i=0;i<5;i++)
        {
            System.out.println("student"+(i+1)+ " ");
            int num=sc.nextInt();
            total+=num;
        }
        int avg=total/5;
        if(avg<40)
        {
            System.out.println("fail");
        }
        else if(avg>40 && avg<=50)
        {
            System.out.println("third division");
        }
        else if(avg>50 && avg<=60)
        {
            System.out.println("second division");
        }
        else if(avg>60 &avg<=75)
        {
            System.out.println("first division");
        }
        else if(avg>75)
        {
            System.out.println("distinction");
        }
    }
}

       
