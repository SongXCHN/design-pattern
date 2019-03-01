import org.github.impl.CurrentConditionsDisplay;
import org.github.impl.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by SongX on 2019/3/1.
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }

}
