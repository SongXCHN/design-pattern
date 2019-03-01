import org.github.Beverage;
import org.github.beverages.Espresso;
import org.github.condiments.Mocha;
import org.github.condiments.Soy;
import org.github.condiments.Whip;

/**
 * Created by SongX on 2019/3/1.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
       beverage = new Mocha(beverage);
       System.out.println(beverage.getDescription() + " $ " + beverage.cost());
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

    }
}
