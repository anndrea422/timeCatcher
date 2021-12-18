package com.example.timeCatcher;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")

public class User {

    @Id @GeneratedValue

    Integer id;
    String name;

    @OneToMany(targetEntity = CompletedWork.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_userId", referencedColumnName = "id")
    List<CompletedWork> CompletedWorks;
}
