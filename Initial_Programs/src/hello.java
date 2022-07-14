//Take name as input and
// print a greeting message for that particular name.

import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String x= sc.next();
        System.out.println("Hello "+x+" have a great day");
    }
}