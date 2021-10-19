package io.work.gestionUserClient.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.print.attribute.standard.DateTimeAtCreation;
import java.io.Serializable;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private String contenu;
    private DateTimeAtCreation dateCreation;
    @ManyToOne
    private Categorie categorie;

}
