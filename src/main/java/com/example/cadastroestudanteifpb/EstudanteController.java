package com.example.cadastroestudanteifpb;//package br.edu.ifpb.cadastroEstudanteIFPB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class EstudanteController {
    private final List<Estudante> estudantes = new ArrayList<>();
    private Integer proximoID= 1;

    @GetMapping("/")
    public String inicio(Model model){
        model.addAttribute("totalDEestudantes", estudantes.size());
        return "index";

  }
    @GetMapping("/estudantes/novo")
    public String novo() {
        return "estudantes/formulario";
    }

    @PostMapping("/estudantes")
    public String cadastrar(@ModelAttribute Estudante estudante) {
        estudantes.add(estudante.comId(proximoID++));
        return "redirect:/listar";
    }

    @GetMapping("/listar")
    public String listar (Model model) {
        model.addAttribute("estudantes", estudantes);
        return "estudantes/lista";
    }

}
