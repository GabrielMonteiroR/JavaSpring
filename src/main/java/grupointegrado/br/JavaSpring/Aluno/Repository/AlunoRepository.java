package grupointegrado.br.JavaSpring.Aluno.repository;

import grupointegrado.br.JavaSpring.Aluno.Models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoEntity extends JpaRepository<Aluno, Integer> {
}
