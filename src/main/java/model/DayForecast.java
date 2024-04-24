package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DayForecast {
    private long dateEpoch;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private DayForecastDay day;
    private DayForecastAstro astro;
    @JsonAlias("hour")
    private List<DayForecastHour> hourForecasts;
}
