import org.github.CdPlayer;
import org.github.HomeTheaterFacade;
import org.github.Screen;

/**
 * Created by SongX on 2019/3/8.
 */
public class HomeTheaterTestDrive {

    public static void main(String[] args) {

        Screen screen = new Screen();
        CdPlayer cd = new CdPlayer();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(cd, screen);

        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
