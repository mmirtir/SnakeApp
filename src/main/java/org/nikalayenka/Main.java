package org.nikalayenka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int level;
        int healpoints;
        int damage;
        String armorType;
        String element;

        System.out.println("Write your nickname: ");
        name = sc.nextLine();

        System.out.println("Write your level: ");
        level = sc.nextInt();

        System.out.println("Write your healpoints: ");
        healpoints = sc.nextInt();

        System.out.println("Write your damage: ");
        damage = sc.nextInt();

        System.out.println("Write your armor type (dimond, gold, iron):");
        armorType = sc.next();
        if (armorType.equals("dimond")) {
            System.out.println("your damage will be boost by 10% if you take a dimond totem in left hand");
        }
        if (armorType.equals("gold")) {
            System.out.println("your healpoints will be boost by 15% if you put a crown on your head");
        }
        if (armorType.equals("iron")) {
            System.out.println("your speed will be boost by 10% if you iron sword");
        }

        System.out.println("Do you have magic sword?");
        String sword = sc.next();
        if (sword.equals("yes")) {
            System.out.println("This is ideal option for you!");
        } else if (sword.equals("no")) {
            System.out.println("good luck!");
        }
        System.out.println("What is your favorite element? (fire, water, earth, air)");
        element = sc.next();
        if (element.equals("fire")) {
            System.out.println("You will be have fireprotection  ");
        }
        if (element.equals("water")) {
            System.out.println("Your speed in water will be boost by 25% ");
        }
        if (element.equals("earth")) {
            System.out.println("You will be have jumpboost if you will stay on grass ");
        }
        if (element.equals("air")) {
            System.out.println("Your fall damage will be reduced ");
        }

        System.out.println("your stats:\nname = " + name +
                "\nlevel = " + level +
                "\nhealpoints = " + healpoints +
                "\ndamage = " + damage +
                "\narmor type = " + armorType +
                "\nmagic sword = " + sword +
                "\nElent = " + element);

    }
}