package dianafriptuleac.u5w1d1pizza.entities;

import lombok.ToString;

import java.util.List;

@ToString
public class Pizze extends PizzaBase {
    private List<String> toppings;

    public Pizze(String nome, double prezzo, int calorie, String pomodoro, String mozzarella, List<String> toppings) {
        super(nome, prezzo, calorie, pomodoro, mozzarella);
        this.toppings = toppings;
    }
}
