package many.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import many.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
