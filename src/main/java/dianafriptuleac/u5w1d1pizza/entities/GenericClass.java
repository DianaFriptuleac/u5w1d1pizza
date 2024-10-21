package dianafriptuleac.u5w1d1pizza.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class GenericClass {
    protected String nome;
    protected double prezzo;
    protected int calorie;
}
