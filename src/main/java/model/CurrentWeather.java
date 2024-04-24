package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CurrentWeather {
    private long lastUpdatedEpoch;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime lastUpdated;
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
    private double humidity;
    private double cloud;
    @JsonAlias("feelslike_c")
    private double feelsLikeCelcius;
    @JsonAlias("feelslike_f")
    private double feelsLikeFahrenheit;
    @JsonAlias("vis_km")
    private double visibilityKilometers;
    @JsonAlias("vis_miles")
    private double visibilityMiles;
    private double uv;
    private double gustMph;
    private double gustKph;
}
