import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("How old are you? ");
        String age = sc.nextLine();
        System.out.println("Your favourite food is?");
        String food =sc.nextLine();

        System.out.println("Your name is:" +name);
        System.out.println("Your age is: "+age);
        System.out.println("You like: "+food);
    }     
}
