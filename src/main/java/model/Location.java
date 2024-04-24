package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Location {
    private String name;
    private String region;
    private String country;
    @JsonAlias("lat")
    private double latitude;
    @JsonAlias("lon")
    private double longitude;
    @JsonAlias("tz_id")
    private String timezoneId;
    @JsonAlias("localtime_epoch")
    private long localTimeEpoch;
    @JsonAlias("localtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime localTime;
}
