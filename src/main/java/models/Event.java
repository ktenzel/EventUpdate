package models;

public class Event {
    private int guest;
    private String food;
    private String drink;
    private String entertainment;
    private String coupon;
    private Integer baseCost;
    private int plate;

    public Event(int guest, String food, String drink, String entertainment, String coupon) {
        this.guest = guest;
        this.food = food;
        this.drink = drink;
        this.entertainment = entertainment;
        this.coupon = coupon;
    }
    public int getGuest() {
        return guest;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public String getCoupon() {
        return coupon;
    }

    public int getPlate() {
        return plate;
    }


    public int calculateFood() {
        int plate = 30;
        if (this.food.equals("Chicken")) {
            plate = plate + 2;
        } else {
            plate = plate;
        } return plate;
    }
    public int calculateDrink() {
        int plate = calculateFood();
        if (this.drink.equals("Spirits")) {
            plate = plate + 3;
        } else {
        } return plate;
    }
    public int totalCost() {
        int plate = calculateDrink();
        Integer baseCost = plate * this.guest;
        if (this.entertainment.equals("DJ")) {
            baseCost = baseCost + 150;
        } else if (this.entertainment.equals("Live Band")) {
            baseCost = baseCost + 500;
        } else if ((this.coupon.equals("FREE DJ")) && (this.guest > 150)) {
            baseCost = baseCost - 150;
        } else if (this.coupon.equals("FIFTY OFF")  && (this.guest > 150)){
            baseCost = baseCost - 50;
        } else {
            baseCost = baseCost;
        } return baseCost;
    }
}
