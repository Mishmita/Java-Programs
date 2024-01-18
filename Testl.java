import java.util.Scanner;
public class Testl
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        do
        {
            System.out.println("input your choice:\n1.ADDITION \n2.MULTIPLICATION\n3.SUBTRACTION\n4.DIVISION\n5.EXIT");
            int choice=sc.nextInt();
            System.out.println("your choice is");
            switch(choice)
            {
                case 1:
                    System.out.println("addition is:"+(num1+num2));
                    break;
                    case 2:
                        System.out.println("multiplication is:"+(num1*num2));
                        break;
                         case 3:
                System.out.println("subtraction is:"+(num1-num2));
                break;
                case 4:
                    System.out.println("division is:"+(num1/num2));
                    break;
            default:
                
                exit(0);
            }
        }
            while(true);
        
    }
}
