package com.example.timeCatcher;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ToString
@NoArgsConstructor
@Setter
@Getter
public class SampleInputs {

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date startTime;
    private Date finishTime;
    private String textWhere;
    private String textDescription;
}