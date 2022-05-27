package me.dio.academia.digital.controller;

import me.dio.academia.digital.controller.impl.AlunoServiceImpl;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll() {
        return service.getAll();
    }

    @PostMapping
        public Aluno create(@RequestBody AlunoForm from){
        AlunoForm form;
        return service.create(form);}
}
