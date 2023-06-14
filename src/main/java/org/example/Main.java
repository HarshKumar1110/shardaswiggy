package org.example;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        String[] vegFood = { "Pav Bhaji", "Samosa", "Aloo tikki", "Paneer tikka", "Ragada pattice ", "Katchi dabeli ",
                "Veg wraps", "Bhelpuri", "Dahi puri", "Sev puri" };
        int[] vegPrice = { 150, 50, 70, 300, 150, 185, 110,45, 80, 50 };

        String[] nonVegFood = { "Chicken Biryani", "Butter Chicken", "Reshmi Kabab", "Tandoori Chicken",
                "Chicken Tikka Masala" };
        int[] nonVegPrice = { 250, 300, 320, 310, 290 };

        String[] mixFood = { "Pav Bhaji", "Samosa", "Aloo tikki", "Paneer tikka", "Ragada pattice ", "Katchi dabeli ",
                "Veg wraps", "Bhelpuri", "Dahi puri", "Sev puri", "Chicken Biryani", "Butter Chicken", "Reshmi Kabab",
                "Tandoori Chicken", "Chicken Tikka Masala" };
        int[] mixPrice = { 150, 50, 70, 300, 150, 185, 110, 45, 80, 50, 250, 300, 320, 310, 290 };

        System.out.println("Welcome to swiggy");

        System.out.println("Which menu do you want");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        System.out.println("3. Mix");

        int option = s1.nextInt();
        s1.close();

        //For Veg Menu
        if (option == 1) {
            System.out.println("Dish  -->  Price");
            for (int i = 0; i < 10; i++) {
                System.out.println(vegFood[i] + " --> " + vegPrice[i]);
            }
        }
        //For Non-Veg Menu
        else if (option == 2) {
            System.out.println("Dish  -->  Price");
            for (int i = 0; i < 5; i++) {
                System.out.println(nonVegFood[i] + " --> " + nonVegPrice[i]);
            }

            //For Mix Menu
        } else if (option == 3) {
            System.out.println("Dish  -->  Price");
            for (int i = 0; i < 15; i++) {
                System.out.println(mixFood[i] + " --> " + mixPrice[i]);
            }

        } else {
            System.out.println("Wrong Input");
        }
    }
}
