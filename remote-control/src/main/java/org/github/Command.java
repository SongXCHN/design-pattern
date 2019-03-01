package org.github;

/**
 * 命令接口
 * Created by SongX on 2019/3/1.
 */
public interface Command {
    void execute();
    void undo(); // 撤销
}
