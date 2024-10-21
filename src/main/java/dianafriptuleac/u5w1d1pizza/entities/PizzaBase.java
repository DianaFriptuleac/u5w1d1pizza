package dianafriptuleac.u5w1d1pizza.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class PizzaBase extends GenericClass {
    protected String pomodoro;
    protected String mozzarella;

    public PizzaBase(String nome, double prezzo, int calorie, String pomodoro, String mozzarella) {
        super(nome, prezzo, calorie);
        this.pomodoro = pomodoro;
        this.mozzarella = mozzarella;
    }
}
