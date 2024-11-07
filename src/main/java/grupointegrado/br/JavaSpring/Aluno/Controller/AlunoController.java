package grupointegrado.br.JavaSpring.Aluno.Controller;

import grupointegrado.br.JavaSpring.Aluno.DTO.CreateAlunoDTO;
import grupointegrado.br.JavaSpring.Aluno.Models.AlunoEntity;
import grupointegrado.br.JavaSpring.Aluno.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<AlunoEntity> getAll() {
        return alunoRepository.findAll();
    }

    @GetMapping("/{id}")
    public AlunoEntity getById(@PathVariable int id) {
        return this.alunoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));
    }

    @PostMapping
    public AlunoEntity save(@RequestBody CreateAlunoDTO dto) {
        AlunoEntity aluno = new AlunoEntity();
        aluno.setNome(dto.nome());
        aluno.setEmail(dto.email());
        aluno.setMatricula(dto.matricula());
        aluno.setData_nascimento(dto.data_nascimento());

        return this.alunoRepository.save(aluno);
    }

    //TODO : ARRUMAR O UPDATE DEPOIS
    @PutMapping("/{id}")
    public AlunoEntity update(@PathVariable int id, @RequestBody CreateAlunoDTO dto) {
        AlunoEntity aluno = this.alunoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));

        aluno.setNome(dto.nome());
        aluno.setEmail(dto.email());
        aluno.setData_nascimento(dto.data_nascimento());

        return this.alunoRepository.save(aluno);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        AlunoEntity aluno = this.alunoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));

        this.alunoRepository.delete(aluno);
    }
}
