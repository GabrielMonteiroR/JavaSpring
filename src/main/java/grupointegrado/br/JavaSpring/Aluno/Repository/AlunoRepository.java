package grupointegrado.br.JavaSpring.Aluno.Repository;

import grupointegrado.br.JavaSpring.Aluno.Models.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Integer> {
}
