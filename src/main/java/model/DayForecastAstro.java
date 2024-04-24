package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.time.LocalTime;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DayForecastAstro {
    @JsonFormat(pattern = "hh:mm a")
    private LocalTime sunrise;
    @JsonFormat(pattern = "hh:mm a")
    private LocalTime sunset;
    @JsonFormat(pattern = "hh:mm a")
    private LocalTime moonrise;
    @JsonFormat(pattern = "hh:mm a")
    private LocalTime moonset;
    private String moonPhase;
    private double moonIllumination;
    @JsonAlias("is_moon_up")
    private boolean isMoonUp;
    @JsonAlias("is_sun_up")
    private boolean isSunUp;
}
