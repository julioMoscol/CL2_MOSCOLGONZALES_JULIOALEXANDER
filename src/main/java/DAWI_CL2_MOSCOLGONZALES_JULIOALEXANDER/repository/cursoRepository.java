package DAWI_CL2_MOSCOLGONZALES_JULIOALEXANDER.repository;

import DAWI_CL2_MOSCOLGONZALES_JULIOALEXANDER.model.bd.curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cursoRepository extends JpaRepository<curso, Integer> {
}
