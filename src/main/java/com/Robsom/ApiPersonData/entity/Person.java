package com.Robsom.ApiPersonData.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "firstName")
    @Column(nullable = false)
    private String firstName;

    @JoinColumn(name = "lastName")
    @Column(nullable = false)
    private String lastName;

    @JoinColumn(name = "cpf")
    @Column(nullable = false, unique = true)
    private String cpf;

    private LocalDate birthDate;

    @JoinColumn(name = "phones")
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones;


}










