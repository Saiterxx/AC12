package com.ac12.demo.controller;

import com.ac12.demo.entity.Funcionario;
import com.ac12.demo.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

    @Autowired
    public FuncionarioService fs;

    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){
        ModelAndView mv = new ModelAndView("Funcionarios");
        mv.addObject("Funcionarios", fs.getFuncionarios());
        return mv;
    }
    @PostMapping("/funcionarios")
    public ModelAndView salvar(@ModelAttribute Funcionario func)
    {
        fs.salvar(func);
        ModelAndView mv = new ModelAndView("Funcionarios");
        mv.addObject("Funcionarios", fs.getFuncionarios());
        return mv;
    }
}