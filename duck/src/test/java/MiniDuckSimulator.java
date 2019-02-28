import org.github.behavior.impl.FlyWithWings;
import org.github.behavior.impl.MuteQuack;
import org.github.model.Duck;
import org.github.model.MallardDuck;

/**
 * Created by SongX on 2019/2/28.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performFly();
        mallard.performQuack();
    }
}
