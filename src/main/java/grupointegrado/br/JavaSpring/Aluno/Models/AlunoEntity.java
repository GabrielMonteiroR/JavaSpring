package grupointegrado.br.JavaSpring.Aluno.Models;

import jakarta.persistence.*;
import org.hibernate.Internal;

import java.util.Date;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String matricula;

    @Column
    private Date data_nascimento;

}
