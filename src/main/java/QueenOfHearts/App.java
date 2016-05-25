package QueenOfHearts;

import java.util.Scanner;

/**
 * Created by jaymilnamow on 5/25/16.
 */
public class App {

    public static void main(String[] args) {
        App start = new App();
        System.out.println("Welcome, what is your name?");
        start.welcome();

    }

    Scanner input = new Scanner(System.in);

    public String welcome(){

        String name = input.nextLine();

        if(name.equals("Alice")){
            System.out.println("Hello Alice.\nWould you like to play a game?");
        } else if(name.equals("Bob")){
            System.out.println("Hello Bob.\nWhere's Alice?");
        } else if(name.equals("Jay")) {
            System.out.println("Awesome! Hey Jay!");
        } else {
            System.out.println("Hello, nice to meet you " + name + ".\n I'm sorry, I don't have much time before the Queen chops off my motherboard. Goodbye.");
        }

        return name;
    }


}


/*
# Alice and Bob Greeting

## Objectives

1. To demonstrate your understanding of objects
2. To demonstrate your understanding of operators
3. To demonstrate your understanding of user input
4. To demonstrate your understanding of strings


## Overview

Write a program that asks the user for his/her name and only the users Alice and Bob are greeted with their names.

## Unit Test

No Unit Test

## Instructions

1. Understand how to get input from user
2. Create conditional to check against Alice and Bob
3. Print greeting to screen if Alice or Bob are true
 */