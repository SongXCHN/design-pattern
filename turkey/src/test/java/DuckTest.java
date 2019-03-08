import org.github.Duck;
import org.github.TurkeyAdapter;
import org.github.impl.MallardDuck;
import org.github.impl.WildTurkey;

/**
 * Created by SongX on 2019/3/6.
 */
public class DuckTest {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck TurkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("the turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("the duck says...");
        testDuck(duck);

        System.out.println("the TurkeyAdapter says...");
        testDuck(TurkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
