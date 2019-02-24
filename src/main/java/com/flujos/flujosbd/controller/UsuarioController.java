package com.flujos.flujosbd.controller;


import com.flujos.flujosbd.dao.UsuariosDao;
import com.flujos.flujosbd.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.sql.SQLException;
import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private UsuariosDao usuariosDao;
/*
    @RequestMapping(value = { "usuarios/list" }, method = RequestMethod.GET)
    public String listarUsuarios(Model model) throws SQLException {

        List<String> list = usuariosDao.listarUsuarios();
        model.addAttribute("listarUsuarios", list);

        return "usuarios/list";
    }

*/

    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String home(Model model) throws SQLException {

        return "home";
    }

    @RequestMapping(value = { "usuarios/list" }, method = RequestMethod.GET)
    public String listarUsuarios(Model model) throws SQLException {

        List<Usuario> list = usuariosDao.findAll();
        model.addAttribute("listarUsuarios", list);

        return "usuarios/list";
    }


    @GetMapping("usuarios/form")
    public String form(ModelMap model){
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        model.addAttribute("outMessage", "");
        return "usuarios/form";
    }


    @PostMapping("/form")
    public String agregar(@ModelAttribute(value = "usuario") Usuario usuario, BindingResult errors, SessionStatus status, ModelMap model) {
        if (errors.hasErrors()) {
            return "usuario/form";
        }


        status.setComplete();
        //usuario.crearUsuario(usuario.getUsuario(), usuario.getPassword());
        usuario.crearUsuario(usuario.getFiusuario(), usuario.getPassword());
        model.addAttribute("crearusuario", usuario);

        return "usuario/form";
    }

}
