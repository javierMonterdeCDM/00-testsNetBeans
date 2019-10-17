/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.naka.java.main;

import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 *
 *
 * Adivina el número oculto, comprendido entre 1 y 100 :D
 */
public class Main {

    //User data introduction declaration
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    //Random number generator declaration
    public static final Random RND = new Random();
    //Detect loop errors in the game
    public static String error
            = "\033[31mERROR:"
            + "\033[1;33m You're not allowed to see this text."
            + "\033[0m ";

    //Clear the screen
    public static void clr() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
    //Declaring all the variables (all of them will be global)
    public static int startUserChoice = 0;

    //The main method, the start of the game
    public static void main(String[] args)
            throws IOException, InterruptedException {
        //Welcome message
        System.out.println("===========================");
        System.out.println("=     WELCOME, PLAYER     =");
        System.out.println("=      -Press ENTER-      =");
        System.out.println("===========================");
        //Waiting for the "Enter" key
        System.in.read();
        //Start the game
        start();
    }

    //The "Start" method, starting the game
    public static void start() throws InterruptedException, IOException {
        //Advising the user of the options it can choose
        System.out.println("Welcome to my game, \"Guess the secret number\"!");
        System.out.println("You have three options, \"1\", \"2\" and \"3\".");
        System.out.println("1) I want to start playing the game.");
        System.out.println("2) Can you explain me how to play, please?");
        System.out.println("3) I want to go out.");
        System.out.print("What option would you choose? ");
        //Expecting a number bettwen the options "1", "2" and "3"
        try {
            startUserChoice = SCN.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a number!");
            startUserChoice = 0;
        }
        SCN.nextLine();
        //Redirecting the user to their respective methods
        switch (startUserChoice) {
            case 1:
                play();
                break;
            case 2:
                info();
                break;
            case 3:
                exit();
                break;
            default:
                System.out.println("Please, insert the options "
                        + "\"1\", \"2\" or \"3\", thanks.");
                Thread.sleep(3000);
                clr();
                start();
                break;
        }
        //Error detection, expecting not to be visible for the user
        System.out.println(error + "start error.");
        exit();
    }

    public static void play() {
        System.out.println(error + "play error.");
        exit();
    }

    public static void info() throws IOException, InterruptedException {
        //Just the info of the game
        System.out.print("Remember: Press enter to jump to the next line.");
        System.in.read();
        clr();
        System.out.printf("The machine will generate a%n"
                + "random number between 1 and 100.");
        System.in.read();
        clr();
        System.out.printf("You need to guess that number, wich you won't be%n"
                + "able to see, except if you win or fail%n"
                + "more than 10 attemtps.");
        System.in.read();
        clr();
        System.out.printf("Exactly as said before, you have 10 attempts to%n"
                + "guess that random hidden number, there will be also a%n"
                + "win/lose/tie counter (only saved in the season,%n"
                + "if you exit the program and enter again,%n"
                + "that counter will be reset).");
        System.in.read();
        clr();
        System.out.print("Good luck, player!");
        System.in.read();
        clr();
        System.out.print("--Press Enter to go to the main menu--");
        System.in.read();
        clr();
        start();
        //Error detection, expecting not to be visible for the user
        System.out.println(error + "info error.");
        exit();
    }

    public static void exit() {
        System.out.println("Thank you, see you next time!");
        System.exit(0);
    }

    public static void javaGenNum() {
        //Error detection, expecting not to be visible for the user
        System.out.println(error + "javaGenNum error.");
        exit();
    }

    public static void userGenNum() {
        //Error detection, expecting not to be visible for the user
        System.out.println(error + "userGenNum error.");
        exit();
    }

    public static void greaterValue() {
        //Error detection, expecting not to be visible for the user
        System.out.println(error + "greaterValue error.");
        exit();
    }

    public static void lessValue() {
        //Error detection, expecting not to be visible for the user
        System.out.println(error + "lessValue error.");
        exit();
    }

    public static void victory() {
        //Error detection, expecting not to be visible for the user
        System.out.println(error + "victory error.");
        exit();
    }

    public static void noMoreAttempts() {
        //Error detection, expecting not to be visible for the user
        System.out.println(error + "noMoreAttempts error.");
        exit();
    }

    public static void playAnotherTime() {
        //Error detection, expecting not to be visible for the user
        System.out.println(error + "playAnotherTime error.");
        exit();
    }
}
