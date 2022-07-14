import java.util.*;

public class Addition {
    // Program for Addition of 2 numbers
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter First Number : ");
        float x=in.nextInt();
        System.out.print("Enter Second Number :");
        float y=in.nextInt();
        float sum=x+y;
        System.out.println("The Addition is : "+ sum);
    }
}
