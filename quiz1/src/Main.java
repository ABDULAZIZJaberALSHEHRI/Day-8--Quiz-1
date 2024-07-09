import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Question 1
        System.out.println("Question '1'");
        System.out.println("- The program will print the largest number among the numbers: ");
        System.out.println("Enter first number: ");
        int num_1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num_2 = input.nextInt();

        System.out.println("Enter third number: ");
        int num_3 = input.nextInt();

        if (num_1 >= num_2 && num_1 >= num_3){
            System.out.println("Largest number is : "+ num_1);
        } else if (num_2 >= num_1 && num_2 >= num_3) {
            System.out.println("Largest number is : "+ num_2);
        } else if (num_3 >= num_1 && num_3 >= num_2) {
            System.out.println("Largest number is : "+ num_3);
        }else System.out.println("zero");


        //Question 2
        System.out.println("\nQuestion '2' ");
        System.out.println("- Enter the String and the index of the character: ");
        System.out.println("Enter String: ");
        input.nextLine();
        String word = input.next();
        System.out.println("number of the index: ");
        int index = input.nextInt();

        char ch = word.charAt(index);
        System.out.println("The character is: "+ch);

        //Question 3
        System.out.println("\nQuestion '3' ");
        System.out.println("- The program will print the sum of your numbers.");

        int sum = 0;
        int num_4;
        do {
            System.out.println("Enter numbers to continue or 0 to exit the program: ");
            num_4 = input.nextInt();
            sum = num_4+sum;
        }while (num_4 != 0);
        System.out.println("The sum of all entered numbers is: " + sum);


        //Question 4
        System.out.println("\nQuestion '4' ");
        System.out.println("- The program will find and print positive and negative numbers of a given array");

        int [] arr = {10, -21, 30, 31, -25};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                System.out.println(arr[i]+ " is a positive number");
            } else if (arr[i] < 0) {
                System.out.println(arr[i]+ " is a negative number");
            }else System.out.println("zero");
        }




        //Question 5
        System.out.println("\nQuestion '5' ");
        System.out.println("- shortest word in the array");

        String[] words = {"Tuwaiq", "Bootcamp", "Student", "JAVA"};

        for (int i = 1; i < words.length; i++) {

            int shortest = words[0].length();

            if (words[i].length() < shortest){
                System.out.println(words[i]);
            }

            }
        }

    }
