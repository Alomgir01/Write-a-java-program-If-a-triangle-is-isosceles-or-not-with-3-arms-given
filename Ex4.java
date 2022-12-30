import java.util.Scanner;
public class Ex4 
{
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter three arms: ");
        int arm1=input.nextInt();
        int arm2=input.nextInt();
        int arm3=input.nextInt();
        {
            if(arm1==arm2 || arm1==arm3 || arm2==arm3)
            {
                System.out.println("Isosceles triangle");
            }
            else
            {
                System.out.println("Not an isosceles Triangle");
            }
            
        }

    }
    
}
