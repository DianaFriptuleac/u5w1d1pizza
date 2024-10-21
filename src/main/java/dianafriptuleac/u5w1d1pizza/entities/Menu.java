package dianafriptuleac.u5w1d1pizza.entities;

import java.util.List;

public class Menu {
    private List<Pizze> allPizze;
    private List<Toppings> allToppings;
    private List<Bevande> allBevande;

    public Menu(List<Pizze> allPizze, List<Toppings> allToppings, List<Bevande> allBevande) {
        this.allPizze = allPizze;
        this.allToppings = allToppings;
        this.allBevande = allBevande;
    }

    public void stampaMenu() {
        System.out.println("Le nostre pizze: ");
        allPizze.forEach(pizza -> System.out.println(pizza));

        System.out.println("Condimenti: ");
        allToppings.forEach(topping -> System.out.println(topping));

        System.out.println("Bevande: ");
        allBevande.forEach(bevanda -> System.out.println(bevanda));
    }
}
