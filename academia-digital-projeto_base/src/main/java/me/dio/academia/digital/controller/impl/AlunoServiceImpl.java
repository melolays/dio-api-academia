package me.dio.academia.digital.controller.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoServiceImpl implements IAlunoService {
    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form){
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());

    }

}
