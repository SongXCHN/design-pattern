import org.github.GumballMachine;

/**
 * Created by SongX on 2019/4/17.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
