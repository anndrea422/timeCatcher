package com.example.timeCatcher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;


@Entity
@Table(name="completed_work")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompletedWork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private String startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private String finishTime;
    private String textWhere;
    private String textDescription;
    private Integer userId;
//    private String totalHours;
}

