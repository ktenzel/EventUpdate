import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        boolean creatingEvent = true;
        ArrayList<Event> createEvent = new ArrayList<Event>();

        while(creatingEvent) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Hello and welcome to our event maker.");
                System.out.println("How many people will be attending your event?");
                int guestCount = Integer.parseInt(bufferedReader.readLine());
                System.out.println("We offer a choice of dishes.");
                System.out.println("Please choose between Chicken is $32 a plate and or Vegetarian is $30");
                String foodChoice = bufferedReader.readLine();
                System.out.println("We offer a choice of drinks.");
                System.out.println("Please choose between Soda or Spirits +$3 to plate cost");
                String drinkChoice = bufferedReader.readLine();
                System.out.println("We offer a choice of entertainment types.");
                System.out.println("Please choose between DJ (+ $150) or Live Band (+ $500) or press enter to skip entertainment choice.");
                String entertainmentChoice = bufferedReader.readLine();
                System.out.println("We offer a couple coupons for groups.");
                System.out.println("Please enter FREE DJ if you choose a DJ or FIFTY OFF if you had more than 150 guest");
                String couponCode = bufferedReader.readLine();
                Event newEvent = new Event(guestCount, foodChoice, drinkChoice, entertainmentChoice, couponCode);
                int totalCost = newEvent.totalCost();
                System.out.println("Great, the total cost of your event is: $" + totalCost);
                System.out.println("You chose:");
                System.out.println("Your food choice was: " + foodChoice);
                System.out.println("Your drink choice was: " + drinkChoice);
                System.out.println("Your entertainment choice was: " + entertainmentChoice);

                createEvent.add(newEvent);
                creatingEvent = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}