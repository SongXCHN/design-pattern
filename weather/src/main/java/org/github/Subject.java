package org.github;

/**
 * 主题
 * Created by SongX on 2019/3/1.
 */
public interface Subject {

    void registerObserver(Observer o); // 注册

    void removeObserver(Observer o); // 移除

    void notifyObservers(); // 通知
}
