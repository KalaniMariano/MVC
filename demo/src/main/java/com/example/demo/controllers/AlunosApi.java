package com.example.demo.controllers;

import com.example.demo.models.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunosApi {


    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunosApi() {

        alunos.add(new Aluno("01", "Kalani", 10, 8));
        alunos.add(new Aluno("02", "Raíssa", 8, 10));
        alunos.add(new Aluno("03", "Luna", 1, 4));
        alunos.add(new Aluno("04", "Bmo", 7, 8));
        alunos.add(new Aluno("05", "Pietra", 10, 10));;
    }

    @GetMapping
    public List<Aluno> getAlunos(){
        return alunos;
    }

}