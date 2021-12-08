package com.example.timeCatcher.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")

public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;
    String name;
}
