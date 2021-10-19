package io.work.gestionUserClient.entity;

import io.work.gestionUserClient.utils.ERole;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ERole name;

}
