import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;
public class collageAssignment {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // My first java program 1

            /* System.out.println("My first JAVA Program");*/

            // Covert the rupees to dollar 2

        /*System.out.println("Enter the $");
        int a = sc.nextInt();
        double dollar = (82.90 * a);
        System.out.println("Rupees " + dollar);*/

            // Calculate the percentage marks to 5 subject 3

        /*System.out.println("Enter your marks maths");
        int a = sc.nextInt();
        System.out.println("Enter your marks Hindi");
        int b = sc.nextInt();
        System.out.println("Enter your marks English");
        int c = sc.nextInt();
        System.out.println("Enter your marks History");
        int d = sc.nextInt();
        System.out.println("Enter your marks Science");
        int e = sc.nextInt();
        float sum = (a + b + c + d + e);
        System.out.println("Your total marks " + sum);
        float per = ((sum / 500) * 100);
        System.out.println("Your" + per + "%");
        if (per > 33 && per <= 90) {
            System.out.println("Pass");
        } else if (per >= 90 && per <= 100) {
            System.out.println("Topper");
        } else {
            System.out.println("Fail");
        }*/

            // Equation and Display the value of x and y 4

       /* double a = 3.4, b = 50.2, c = 44.5, d = 2.1, e = 0.55, f = 5.9;
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        System.out.println("x is" + x + "y is" + y);*/

            // Read a number in meters converts into to feet 5

       /* System.out.println("Enter the Meter");
        int number = sc.nextInt();
        double feet = (3.28084 * number);
        System.out.println("feet " + feet);*/

            // Count the Number of words that start with capital latter 6

        /*String name = "I am java Developer";
        int value = name.length();
        System.out.println(value);*/

            // User enter three integer and display the integer in decreasing order 7

        /*Integer array[] = { 9, 5, 7 };
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));*/

            // user to enter a letter and check weather a letter is vowel and consonant 8

        /*System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " is a vowel");
        else
            System.out.println(ch + " is a consonant");

        System.out.println("Enter a string: ");
        String input = sc.nextLine().toLowerCase();
        sc.close();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);*/

            //write a program print  string entered in pyramid form instance ,the stream displayed 9


            int a = 6;
            for (int i= 0; i<a; i++){
                for (int j=a-i-1;j>=1;j--)
                    System.out.println(" ");
                for (int j= 0; j<=i; j++)
                    System.out.println("* ");
                System.out.println();
            }




            // Write the program find the length of string and print the second of string 10

        /*String s;
        System.out.println("Enter the String");
        s = sc.next();
        int l = s.length();
        System.out.println("The length of string " + l);
        System.out.println("Substring " + s.substring(l / 2));*/

            // Write a program find given number or string is palindrome or not 11

        /*String s = new String();
        System.out.println("Enter the String");
        s = sc.next();
        String rev = "";
        for (i = s.length() - 1; i >= 0; i++)
            rev = rev + s.charAt(i);
        {
            if (s.equals(rev)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
        }*/

        }
    }


