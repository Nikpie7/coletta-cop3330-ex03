/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "What is the quote? " );
        String quote = scan.nextLine();

        System.out.print( "Who said it? ");
        String name = scan.nextLine();

        System.out.println( name + " says, \"" + quote + "\"");
    }
}
