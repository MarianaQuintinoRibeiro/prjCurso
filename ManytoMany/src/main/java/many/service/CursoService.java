package many.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import many.entities.Curso;
import many.repository.CursoRepository;

@Service
public class CursoService {
	private final CursoRepository cursoRepository;
	
	@Autowired
	public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso getCursoById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public void deleteCurso(Long id) {
    	cursoRepository.deleteById(id);
    }
}
