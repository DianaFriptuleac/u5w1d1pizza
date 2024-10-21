package dianafriptuleac.u5w1d1pizza.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bevande extends GenericClass {
    private int quantita;

    public Bevande(String nome, double prezzo, int calorie, int quantita) {
        super(nome, prezzo, calorie);
        this.quantita = quantita;
    }
}
