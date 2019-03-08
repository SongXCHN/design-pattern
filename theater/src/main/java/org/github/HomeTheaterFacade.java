package org.github;

/**
 * Created by SongX on 2019/3/8.
 */
public class HomeTheaterFacade {
    CdPlayer cd;
    Screen screen;

    public HomeTheaterFacade(CdPlayer cd, Screen screen) {
        this.cd = cd;
        this.screen = screen;
    }

    public void watchMovie() {
        screen.down();
        cd.up();

    }

    public void endMovie() {
        screen.up();
        cd.down();
    }
}
