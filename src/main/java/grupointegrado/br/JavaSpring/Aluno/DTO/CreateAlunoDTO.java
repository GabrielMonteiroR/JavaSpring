package grupointegrado.br.JavaSpring.Aluno.DTO;

import java.util.Date;

public record CreateAlunoDTO(String nome, String email, String matricula, Date data_nascimento) {

}
