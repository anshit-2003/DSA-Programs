//Write a program to print
// whether a number is even or odd,
// also take input from the user.

import java.util.Scanner;
public class even_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Check : ");
        int x=sc.nextInt();
        if(x%2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }

    }
}
