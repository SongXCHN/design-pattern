package org.github.impl;

import org.github.Command;
import org.github.model.Light;

/**
 * Created by SongX on 2019/3/1.
 */
public class LightCommand implements Command {

    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
