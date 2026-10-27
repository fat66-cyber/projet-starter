package org.sebsy.compta.essai;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "ArticleCourt")
@Table(name = "article")
public class ArticleCourt {
    @Id
    Long id;

    String ref;
}

