package com.company;

/*
 * CS312 Assignment 2.
 * On my honor, <Shabnam Sayahi>, this programming assignment is my own work.
 *
 * A program that produces an ASCII art representation of the UT Tower.
 *
 *  Name: Shabnam Sayahi
 *  email address: shabnam.sayahi1@gmail.com
 *  UTEID: ss84778
 *  Section 5 digit ID: 51410
 *  Grader name: Omer Mahtey
 *  Number of slip days used on this assignment: 0
 */
public class Tower {

    //a program to print an ASCII art representation of the UT Tower.
    public static void main(String[] args) {
        headOfTheTower();
        bodyOfTheTower();
        baseOfTheTowerTop();
        baseOfTheTowerBottom();
    }

    //print an ASCII art representation of the UT Tower with the size of 3
    public static final int SIZE = 4;

    // Prints the top of the tower:hashtags and pipes
    public static void headOfTheTower() {
        hashTags();
        pipes();
        hashTags();
    }

    // prints the middle part of the tower: Tildes + pipes + dashes + circles
    public static void bodyOfTheTower() {
        for (int i = 1; i <= SIZE * SIZE; i++) {
            bodyOfTheTowerTilde();
            bodyOfTheTowerCirclePart();
        }
        bodyOfTheTowerTilde();
    }

    // Prints the first part of the base (forward slash + quotation marks + single quote + back slash)
    public static void baseOfTheTowerTop() {
        int LINES_TOTAL = SIZE / 2 + 1;
        int SPACES_TOTAL = SIZE / 2 * 3;
        int QUOTES_TOTAOL = SIZE * 5 - 3 * (SIZE / 2);
        for (int line = 1; line <= LINES_TOTAL; line++) {
            for (int spaces = 1; spaces <= SPACES_TOTAL; spaces++) {
                System.out.print(" ");
            }
            SPACES_TOTAL = SPACES_TOTAL - 3;
            System.out.print("/");
            // Prints the quotation parts

            //int QUOTES_TOTAOL = SIZE * 5 - 3 * (SIZE / 2);
            for (int quotes = 1; quotes <= QUOTES_TOTAOL; quotes++) {
                System.out.print("\"'");
            }
            QUOTES_TOTAOL = QUOTES_TOTAOL + 3;
            System.out.println("\"\\");
        }
    }


    // Prints the second part of the bottom part of the tower (last part).
    public static void baseOfTheTowerBottom() {
        for (int i = 1; i <= SIZE; i++) {
            System.out.print("/");
            for (int j = 1; j <= 5 * SIZE; j++) {
                System.out.print("\"O");
            }
            System.out.println("\"\\");
        }
    }

    // prints a line of hash-tags.
    public static void hashTags() {
        for (int spaces = 1; spaces <= 4 * SIZE + 2; spaces++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * SIZE - 1; j++) {
            System.out.print("#");
        }
        System.out.println();
    }

    // prints the pipes between the hashtag lines (top part of tower).
    public static void pipes() {
        for (int line = 1; line <= 2 * SIZE - 2; line++) {
            for (int spaces = 1; spaces <= 4 * SIZE + 2; spaces++) {
                System.out.print(" ");
            }
            for (int pipes = 1; pipes <= 2 * SIZE - 1; pipes++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }

    // Prints a solid line of tildes.
    public static void bodyOfTheTowerTilde() {
        for (int spaces = 1; spaces <= 4 * SIZE; spaces++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * SIZE + 3; j++) {
            System.out.print("~");
        }
        System.out.println();
    }

    //Middle part of the tower: prints spaces + one pipe at the beginning and one at the end of the line with dashes and circles in between.
    public static void bodyOfTheTowerCirclePart() {
        for (int space = 1; space <= 4 * SIZE; space++) {
            System.out.print(" ");
        }
        System.out.print("|");
        for (int dash = 1; dash <= SIZE; dash++) {
            System.out.print("-O");
        }
        System.out.println("-|");
    }
}






