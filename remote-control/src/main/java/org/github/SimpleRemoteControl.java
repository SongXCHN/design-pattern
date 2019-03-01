package org.github;

/**
 * Created by SongX on 2019/3/1.
 */
public class SimpleRemoteControl {
    Command slot;
    Command undoCommand;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
        undoCommand = slot;
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
}
