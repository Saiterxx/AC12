package com.ac12.demo.service;

import java.util.List;

import com.ac12.demo.entity.Funcionario;
import com.ac12.demo.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FuncionarioService {
        @Autowired
        private FuncionarioRepository repository;

        public List<Funcionario> getFuncionarios(){

            return repository.findAll();
        }

        public void salvar (Funcionario func)
        {
            if (func.getDepartamento().equals(null)||func.getIdade() <= 0||func.getNome().equals(null)||func.getSalario()<=0)
            return;
            
            repository.save(func);

        }
}