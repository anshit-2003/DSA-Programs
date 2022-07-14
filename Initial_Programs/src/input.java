//Input Number


import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("Input Program");
        Scanner in = new Scanner(System.in);
        int x;
        System.out.print("Enter Number : ");
        x=in.nextInt();
        System.out.println("Your input is : "+x );
    }
}
