package many.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import many.entities.Aluno;
import many.service.AlunoService;


@RestController
@RequestMapping("/alunos")
public class AlunoController {
	private final AlunoService alunoService;
	
	@Autowired
	public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
	
	@PostMapping
	public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoService.saveAluno(aluno);
    }
	
	@GetMapping("/{id}")
	public Aluno getAluno(@PathVariable Long id) {
        return alunoService.getAlunoById(id);
    }
	
	@GetMapping
	public List<Aluno> getAllAlunos() {
        return alunoService.getAllAlunos();
    }
	
	@DeleteMapping("/{id}")
	public void deleteAluno(@PathVariable Long id) {
       alunoService.deleteAluno(id);
    }

}
