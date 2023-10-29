package DAWI_CL2_MOSCOLGONZALES_JULIOALEXANDER.controller;

import DAWI_CL2_MOSCOLGONZALES_JULIOALEXANDER.service.cursoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/cursos")
public class cursoController {

    private cursoService cursoService;

    @GetMapping("/cursos")
    public String cursos(Model model){
        model.addAttribute("listacursos", cursoService.listarCursos());
        return "cursos/cursos";
    }
}
