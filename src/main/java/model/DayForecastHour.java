package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DayForecastHour {
    @JsonAlias("time_epoch")
    private long timeEpoch;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime time;
    @JsonAlias("temp_c")
    private double celcius;
    @JsonAlias("temp_f")
    private double fahrenheit;
    @JsonAlias("is_day")
    private boolean isDay;
    private WeatherCondition condition;
    private double windMph;
    private double windKph;
    private double windDegree;
    @JsonAlias("wind_dir")
    private String windDirection;
    private double pressureMb;
    private double pressureIn;
    @JsonAlias("precip_in")
    private double precipitationIn;
    @JsonAlias("precip_mm")
    private double precipitationMm;
    private double snowCm;
    private double humidity;
    private double cloud;
    @JsonAlias("feelslike_c")
    private double feelsLikeCelcius;
    @JsonAlias("feelslike_f")
    private double feelsLikeFahrenheit;
    @JsonAlias("windchill_c")
    private double windChillCelcius;
    @JsonAlias("windchill_f")
    private double windChillFahrenheit;
    @JsonAlias("heatindex_c")
    private double heatIndexCelcius;
    @JsonAlias("heatindex_f")
    private double heatIndexFahrenheit;
    @JsonAlias("dewpoint_c")
    private double dewpointCelcius;
    @JsonAlias("dewpoint_f")
    private double dewpointFahrenheit;
    @JsonAlias("will_it_rain")
    private boolean willItRain;
    private double chanceOfRain;
    @JsonAlias("will_it_snow")
    private boolean willItSnow;
    private double chanceOfSnow;
    @JsonAlias("vis_km")
    private double visibilityKilometers;
    @JsonAlias("vis_miles")
    private double visibilityMiles;
    private double uv;
    private double gustMph;
    private double gustKph;
}
