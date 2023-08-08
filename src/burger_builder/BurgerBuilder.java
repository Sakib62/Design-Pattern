package burger_builder;

public class BurgerBuilder {
    private int cheese;
    private int tomato;
    private int meat;
    private int onions;

    public BurgerBuilder setCheese(int cheese) {
        this.cheese = cheese;
        return this;
    }

    public BurgerBuilder setTomato(int tomato) {
        this.tomato = tomato;
        return this;
    }

    public BurgerBuilder setMeat(int meat) {
        this.meat = meat;
        return this;
    }

    public BurgerBuilder setOnions(int onions) {
        this.onions = onions;
        return this;
    }

    public Burger getBurger() {
        return new Burger(cheese,tomato,meat,onions);
    }
}
