package org.github;

/**
 * 观察者
 * Created by SongX on 2019/3/1.
 */
public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
