/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofnumbers;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class SumofNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Please, enter the second number: ");
        int num2 = input.nextInt();

        System.out.printf("The sum of %d and %d is: %d\n", num1, num2, sum(num1, num2));

    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

}
