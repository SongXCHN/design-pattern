import org.github.Coffee;
import org.github.Tea;

/**
 * Created by SongX on 2019/3/8.
 */
public class BeverageTestDrive {

    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareRecipe();
        System.out.println();
        coffee.prepareRecipe();
    }
}
