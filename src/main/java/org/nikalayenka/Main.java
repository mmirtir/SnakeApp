package org.nikalayenka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* System.out.println("Hi! I am Miraslau from Wawa 🐍");
        System.out.println("This is my snake:");
       System.out.println("~@~@~@~@~@~@~@~@~@~");
       */
Scanner sc = new Scanner(System.in);

        System.out.println("Write your nickname: ");
        String name = sc.nextLine();

        System.out.println("Write your level: ");
        int lvl = sc.nextInt();

        System.out.println("Write your healpoints: ");
        int hp = sc.nextInt();

        System.out.println("Write your damage: ");
        int dmg = sc.nextInt();

        System.out.println("Write your armor type (dimond, gold, iron):");
        String At = sc.next();
        if (At.equals("dimond")) {
                System.out.println("your damage will be boost by 10% if you take a dimond totem in left hand");
        }
        if (At.equals("gold")) {
                System.out.println("your healpoints will be boost by 15% if you put a crown on your head");
        }
        if (At.equals("iron")) {
                System.out.println("your speed will be boost by 10% if you iron sword");
        }

        System.out.println("Do you have magic sword?");
        String sword = sc.next();
        if (sword.equals("yes")) {
                System.out.println("This is ideal option for you!");
        }
        else if (sword.equals("no")) {
                System.out.println("good luck!");
        }
        System.out.println("What is your favorite element? (fire, water, earth, air)");
        String E = sc.next();
        if (E.equals("fire")) {
                System.out.println("You will be have fireprotection  ");
        }
                if (E.equals("water")) {
                        System.out.println("Your speed in water will be boost by 25% ");
                }
                        if (E.equals("earth")) {
                                System.out.println("You will be have jumpboost if you will stay on grass ");
                                }
                                if (E.equals("air")) {
                                        System.out.println("Your fall damage will be reduced " );
                                }

        System.out.println("your stats:\nname = " + name +
                "\nlevel = " + lvl +
                "\nhealpoints = " + hp +
                "\ndamage = " + dmg +
                "\narmor type = " + At +
                "\nmagic sword = " + sword +
                "\nElent = " + E);

    }
}