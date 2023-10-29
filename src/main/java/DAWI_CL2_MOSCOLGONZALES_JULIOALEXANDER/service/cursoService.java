package DAWI_CL2_MOSCOLGONZALES_JULIOALEXANDER.service;

import DAWI_CL2_MOSCOLGONZALES_JULIOALEXANDER.model.bd.curso;
import DAWI_CL2_MOSCOLGONZALES_JULIOALEXANDER.repository.cursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class cursoService {

    private cursoRepository cursoRepository;

    public List<curso> listarCursos(){
        return cursoRepository.findAll();
    }

    public boolean registrarCurso(curso curso){
        return cursoRepository.save(curso) != null;
    }

    public void eliminarCurso(Integer idcurso){
        cursoRepository.deleteById(idcurso);
    }
}
