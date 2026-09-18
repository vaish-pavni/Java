import java.util.Scanner;
public class mul {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter first number:");

        int a=input.nextInt();
        System.out.print("Enter second number:");

        int b=input.nextInt();

        int mul=a*b;

        System.out.print("The multiplication is:" +mul);
    }
}

