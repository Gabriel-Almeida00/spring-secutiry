package com.mballem.curso.security.web.controller;

import com.mballem.curso.security.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("u")
public class UsuarioController {

    @GetMapping("/novo/cadastro/usuario")
    public String cadastroPorAdminMedicoPaciente(Usuario usuario){
        return "usuario/cadastro";
    }

}
