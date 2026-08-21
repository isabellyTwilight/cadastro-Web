package com.example.cadastroestudanteifpb;//package br.edu.ifpb.cadastroEstudanteIFPB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class EstudanteController {

    @GetMapping("/")
    public String inicio(Model model){
        model.addAttribute("totalDEestudantes", 0);
        return "index";

  }
    @GetMapping("/estudantes/novo")
    public String novo() {
        return "estudantes/formulario";
    }
    @PostMapping("/estudantes/confirmar")
    public String confirmar (
            @RequestParam String nome,
            @RequestParam String email,
            Model model){
        model.addAttribute("nome", nome);
        model.addAttribute("email", email);
        return "estudantes/confirmacao";

    }
    @PostMapping("/estudantes/confirmar")
    public String confirmar(
            @ModelAttribute Estudante estudante,
            Model model) {
        model.addAttribute("estudante", estudante);
}
