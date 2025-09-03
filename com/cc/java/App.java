package com.cc.java;

public class App 


    public static void main(String[] args) 
   import java.util.Scanner;

public class Bestellung {
    public static void main(String[] args); {
        Scanner scanner = new Scanner(System.in);

        String food = "";
        String drink = "";

        System.out.println("Herzlich Willkommen bei MD, Ihre Bestellung bitte!");
        System.out.println("Hamburger (1), Cheeseburger (2) oder Chilicheeseburger (3)?");

        int burgerAuswahl = Integer.parseInt(scanner.nextLine());

        switch (burgerAuswahl) {
            case 1:
                food = "Hamburger";
                break;
            case 2:
                food = "Cheeseburger";
                break;
            case 3:
                food = "Chilicheeseburger";
                break;
            default:
                System.out.println("Ungültige Auswahl, es gibt einen Hamburger.");
                food = "Hamburger";
        }

        System.out.println("Möchten Sie ein Getränk dazu bestellen? (j/n)");
        String antwort = scanner.nextLine();

        if (antwort.equalsIgnoreCase("j")) {
            System.out.println("Cola (1), Fanta (2), Sprite (3)?");
            int getraenkAuswahl = Integer.parseInt(scanner.nextLine());

            switch (getraenkAuswahl) {
                case 1:
                    drink = "Cola";
                    break;
                case 2:
                    drink = "Fanta";
                    break;
                case 3:
                    drink = "Sprite";
                    break;
                default:
                    System.out.println("Ungültige Auswahl, kein Getränk bestellt.");
                    drink = "";
            }

            System.out.println("Hier ist Ihre Bestellung: " + food + " und " + drink);
        } else {
            System.out.println("Hier ist Ihre Bestellung: " + food);
        }

        System.out.println("Vielen Dank, und Auf Wiedersehen!");
        scanner.close();
    }
}
 