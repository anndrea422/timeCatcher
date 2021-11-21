package com.example.timeCatcher;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "finishedwork")

public class FinishedWork {
    @Id @GeneratedValue
    Integer Id;
    Integer userId;
    Date date;
    Time startTime;
    Time finishTime;
    Long workedHours;
    String location;
    String comment;




}
