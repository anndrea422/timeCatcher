package com.example.timeCatcher.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name = "finishedwork")
public class FinishedWork {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer userId;
    Date date;
    Time startTime;
    Time finishTime;
    Long workedHours;
    String location;
    String comment;



}
