package many.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import many.entities.Aluno;
import many.entities.Curso;
import many.repository.AlunoRepository;
import many.repository.CursoRepository;

@Service
public class AlunoService {
	private final AlunoRepository alunoRepository;
	
	@Autowired
	public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno saveAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno getAlunoById(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    public void deleteAluno(Long id) {
    	alunoRepository.deleteById(id);
    }
}
