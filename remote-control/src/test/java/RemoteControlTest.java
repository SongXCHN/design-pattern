import org.github.SimpleRemoteControl;
import org.github.impl.LightCommand;
import org.github.model.Light;

/**
 * Created by SongX on 2019/3/1.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightCommand lightOn = new LightCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.undoButtonWasPressed();
    }


}
