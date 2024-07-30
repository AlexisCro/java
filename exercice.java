import java.util.Scanner;

public class exercice {
    public static void main(String[] args) {
        // Determine the odd or even number
        System.out.println("Enter a number: \n");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // Determine the sum of prime numbers
        // System.out.println("Enter a number: \n");
        // int number2 = scanner.nextInt();
        // int[] array = new int[number2];
        // int index = 0;
        // int divisor = 2; 

        // while (array[number2 - 1] != 0) {
        //   int[] divisorList = new int[divisor];

        //   for (int i = 2; i <= divisor; i++)
        //     if (i % divisor == 0) {
        //       divisorList[i] = i;

        //       if (divisorList[divisor] != 0) {
        //         array[index] = i;
        //       }

        //       index++;
        //       divisor++;
        //     }
        //   }
        // }

        // int sum = 0;
        // for (int i = 0; i < array.length; i++) {
        //   sum += array[i];
        // }

        // System.out.println("The sum of prime numbers is: " + sum);

        // Find the max numbers
        System.out.println("Enter your numbers seperated by a comma like \"2,3,4\": \n");
        String numbers = scanner.next();
        String[] numbersArray = numbers.split(",");
        int maxNumber = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            maxNumber = Math.max(maxNumber, Integer.parseInt(numbersArray[i]));
        }

        System.out.println("The max number is: " + maxNumber);

        // day of week
        final String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        System.out.println("Enter a number between 1 and 7: \n");
        int day = scanner.nextInt();

        if (day >= 1 && day <= 7) {
            System.out.println("The day is: " + days[day - 1]);
        } else {
            System.out.println("The number is not between 1 and 7");
        }
    }
}