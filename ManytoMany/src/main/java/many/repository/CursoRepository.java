package many.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import many.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
