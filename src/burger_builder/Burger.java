package burger_builder;

public class Burger {
    private int cheese;
    private int tomato;
    private int meat;
    private int onions;

    public Burger(int cheese, int tomato, int meat, int onions) {
        this.cheese = cheese;
        this.tomato = tomato;
        this.meat = meat;
        this.onions = onions;
    }

    public int getCheese() {
        return cheese;
    }

    public int getTomato() {
        return tomato;
    }

    public int getMeat() {
        return meat;
    }

    public int getOnions() {
        return onions;
    }

    public int getTotalToppings() {
        return getCheese()+getTomato()+getMeat()+getOnions();
    }

    public int getCheesePrice() {
        return getCheese()*10;
    }

    public int getTomatoPrice() {
        return getTomato()*5;
    }

    public int getMeatPrice() {
        return getMeat()*20;
    }

    public int getOnionsPrice() {
        return getOnions()*2;
    }

    public int getTotalPrice() {
        return getCheesePrice()+getTomatoPrice()+getMeatPrice()+getOnionsPrice();
    }
}