import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {
    public static void main(String[] args) {
        System.out.println("Week 1 Day 2");


        /*
         TODO:
          Task 1
        Write a Java method that returns the difference between the largest and smallest values in an array of integers. The length of the array must be at least 1.
        */

        int [] numbers = {3469, 4989, 4557, 4566, 2827,5654 }; //array with the numbers
        System.out.println("---Numbers---");

        int min = numbers[0]; // create a variable to iterate looking for the smallest number
        int max = numbers[0];

        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The smallest value is: " + min);
        System.out.println("The highest value is: " + max);

        System.out.println("The difference between the maximum and the minimum value is: " + (max-min));


        /* Task 2
        Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.
        */
//        int second = numbers[0];
//
//        do {
//            second++;
//        } while (second > min); // previous test

        Arrays.sort(numbers);
        int second = numbers[1];

        System.out.println(Arrays.toString(numbers)); // return ordered array
        System.out.println("The second smallest number is: " + second); // return second smallest number

        int x = 2;
        int y = 8;

        System.out.println(doMath(x,y));

        /*
        Task 3
        Write a Java method that calculates the result of the following mathematical expression, where x and y are two variables that have been pre-set in your code:
        */

        // System.out.println("The result is: " + doMath(2,3);)
    }
    public static double doMath(int x, int y){
        double part1 = (int) Math.pow(x, 2);
        double part2 = (4.0 * y / 5.0) - x;
        double part3 = (int) Math.pow(part2, 2);
        return part1 + part3;

    }
}