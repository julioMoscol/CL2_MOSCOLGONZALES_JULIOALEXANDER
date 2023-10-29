package DAWI_CL2_MOSCOLGONZALES_JULIOALEXANDER.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "curso")
@Data
public class curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idcurso;

    @Column(name = "nomcurso")
    private String nomcurso;

    @Column(name = "credito")
    private Integer credito;
}
