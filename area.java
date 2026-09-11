import java.util.Scanner;
public class area {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius:");
        double r=sc.nextDouble();
        double area = r*r;
        System.out.println("Area of circle is : "+area);
    }
}
