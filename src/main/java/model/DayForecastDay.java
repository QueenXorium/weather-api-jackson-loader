package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DayForecastDay {
    @JsonAlias("maxtemp_c")
    private double highCelcius;
    @JsonAlias("maxtemp_f")
    private double highFahrenheit;

    @JsonAlias("mintemp_c")
    private double lowCelcius;
    @JsonAlias("mintemp_f")
    private double lowFahrenheit;

    @JsonAlias("avgtemp_c")
    private double averageCelcius;
    @JsonAlias("avgtemp_f")
    private double averageFahrenheit;

    @JsonAlias("maxwind_kph")
    private double maxWindKph;
    @JsonAlias("maxwind_mph")
    private double maxWindMph;


    @JsonAlias("totalprecip_in")
    private double totalPrecipitationIn;
    @JsonAlias("totalprecip_mm")
    private double totalPrecipitationMm;
    @JsonAlias("totalsnow_cm")
    private double totalSnowCm;

    @JsonAlias("avgvis_km")
    private double averageVisibilityKm;
    @JsonAlias("avgvis_miles")
    private double averageVisibilityMiles;

    @JsonAlias("avghumidity")
    private double averageHumidity;

    @JsonAlias("daily_will_it_rain")
    private boolean willItRain;
    @JsonAlias("daily_chance_of_rain")
    private double chanceOfRain;

    @JsonAlias("daily_will_it_snow")
    private boolean willItSnow;
    @JsonAlias("daily_chance_of_snow")
    private double chanceOfSnow;

    private WeatherCondition condition;
    private double uv;
}
