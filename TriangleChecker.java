package homework_algorithms;

import java.util.Scanner;

public class TriangleChecker {


    public static void main(String[] args) {
//        First task
//        Algorithm
//        1. Enter three numbers.
//        2. Check if they are positive.
//        3. Checking if conditions are met: the sum of any two sides is greater than the third.
//        4. If the condition is met, then we display a message that the triangle exists,
//        otherwise we display a message that the triangle does not exist.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers to check if it is triangle : ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        if (firstNum <= 0 || secondNum <= 0 || thirdNum <= 0) {
            System.out.println("Numbers should be positive");
        } else if (firstNum + secondNum > thirdNum && secondNum + thirdNum > firstNum
                && firstNum + thirdNum > secondNum) {
            System.out.println("Triangle exists!");
        } else {
            System.out.println("Triangle does not exist!");
        }
    }
}
